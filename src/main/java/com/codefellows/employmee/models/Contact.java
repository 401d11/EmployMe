package com.codefellows.employmee.models;
// using SendGrid's Java Library
// https://github.com/sendgrid/sendgrid-java
import com.sendgrid.*;
import com.sendgrid.helpers.mail.Mail;
import com.sendgrid.helpers.mail.objects.Content;
import com.sendgrid.helpers.mail.objects.Email;

import java.io.IOException;

//maybe need to make this an entity?
public class Contact {
  public static void sendEmail(String toAddress, String _subject, String _body) throws IOException {
    Email from = new Email("haustin.kimbrough@hotmail.com");
    Email to = new Email(toAddress);
    Content content = new Content("text/plain", _body);
    Mail mail = new Mail(from, _subject, to, content);

    SendGrid sg = new SendGrid(System.getenv("SENDGRID_API_KEY"));
    Request request = new Request();
    String env = System.getenv("SENDGRID_API_KEY");
    System.out.println(env);
    try {
      request.setMethod(Method.POST);
      request.setEndpoint("mail/send");
      request.setBody(mail.build());
      Response response = sg.api(request);
      System.out.println(response.getStatusCode());
      System.out.println(response.getBody());
      System.out.println(response.getHeaders());
    } catch (IOException ex) {
      throw ex;
    }
  }
}