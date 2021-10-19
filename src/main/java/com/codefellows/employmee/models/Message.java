package com.codefellows.employmee.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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

    @Override
    public String toString() {
        String string = "Job Title: " + jobTitle +
                "\nJob Description: " + jobDescription +
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
