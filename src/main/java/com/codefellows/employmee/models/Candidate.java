package com.codefellows.employmee.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.Set;

@Entity
public class Candidate extends Account{

    private String firstname;
    private String lastname;
    private String language;
    private String bio;

    protected Candidate(){}

    public Candidate( String username, String password, String email, String phone, boolean isBusiness, String firstname, String lastname, String language, String bio, int yearsOfExperience) {
        super( username, password, email, phone, isBusiness);
        this.firstname = firstname;
        this.lastname = lastname;
        this.language = language;
        this.bio = bio;
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    private int yearsOfExperience;

}
