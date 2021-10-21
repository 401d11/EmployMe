package com.codefellows.employmee.models;


import com.sendgrid.Method;
import com.sendgrid.Request;
import com.sendgrid.Response;
import com.sendgrid.SendGrid;
import com.sendgrid.helpers.mail.Mail;
import com.sendgrid.helpers.mail.objects.Content;
import com.sendgrid.helpers.mail.objects.Email;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.IOException;
import java.util.Date;

@Entity
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long Id;

    String jobTitle;
    String jobDescription;
    String salaryRange;
    String startingDate;
    String jobType;
    String jobLocation;

    public Message(String jobTitle, String jobDescription, String salaryRange, String startingDate, String jobType, String jobLocation) {
        this.jobTitle = jobTitle;
        this.jobDescription = jobDescription;
        this.salaryRange = salaryRange;
        this.startingDate = startingDate;
        this.jobType = jobType;
        this.jobLocation = jobLocation;
    }

    public static void sendEmail(String toAddress, String _subject, String _body) throws IOException {
        Email from = new Email("employMeeCandidateHelper@gmail.com");
        Email to = new Email(toAddress);
        Content content = new Content("text/plain", _body);
        Mail mail = new Mail(from, _subject, to, content);

        SendGrid sg = new SendGrid(System.getenv("SENDGRID_API_KEY"));
        Request request = new Request();
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

    @Override
    public String toString() {
        String string = "Job Title: \n" + jobTitle +
                "\nJob Description: \n" + jobDescription +
                "\nSalary Range: " + salaryRange +
                "\nStarting Date: " + startingDate +
                "\nJob Type: " + jobType +
                "\nJob Location: " + jobLocation;
        return string;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public String getSalaryRange() {
        return salaryRange;
    }

    public String getStartingDate() {
        return startingDate;
    }

    public String getJobType() {
        return jobType;
    }

    public String getJobLocation() {
        return jobLocation;
    }
}
