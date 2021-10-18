package com.codefellows.employmee.repositories;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.security.Principal;

@Controller
public class AccountRepository {

    @Autowired
    private HttpServletRequest request;

    @GetMapping("/")
    public String getHomePage() {return "/index";
    }

    @GetMapping("/login")
    public String getLoginPage() {return "login.html";}

    @GetMapping("/signup")
    public String getSignupPage() {return "signup.html";}


    @GetMapping("/discover")
    public String getDiscoverPage() {return "discover.html";}

    @GetMapping("/discover/{candidateID}")
    public String getCandidateProfile() {return "discoverCandidate.html";}

    @PostMapping("/recruit/{candidateID}")
    public String recruitCandidate(){return "recruitForm.html"}

    @GetMapping("/account")
    public String getAccountPage(Model m, Principal p, @PathVariable String username){

    }

    @PostMapping("/signup")
    public RedirectView createAccountr() {

    }







        // Helper class
    public void authWithHttpServlet (String username, String password){
        try{
            request.login(username, password);
        } catch (ServletException se){
            // print out stack trace
            se.printStackTrace();
        }
    }
}
