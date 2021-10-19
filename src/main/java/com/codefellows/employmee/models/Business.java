package com.codefellows.employmee.models;

import javax.persistence.Entity;

@Entity
public class Business extends Account {

    private String companyName;

    protected Business(){}

    public Business(String username, String password, String email, String phone, boolean isBusiness, String companyName) {
        super(username, password, email, phone, isBusiness);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }


}
