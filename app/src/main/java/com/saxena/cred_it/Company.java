package com.saxena.cred_it;

public class Company {
    String company_logo;
    String company_name;
    String company_discount;

    public Company(String company_logo, String company_name, String company_discount) {
        this.company_logo = company_logo;
        this.company_name = company_name;
        this.company_discount = company_discount;
    }

    public String getCompany_logo() {
        return company_logo;
    }

    public void setCompany_logo(String company_logo) {
        this.company_logo = company_logo;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getCompany_discount() {
        return company_discount;
    }

    public void setCompany_discount(String company_discount) {
        this.company_discount = company_discount;
    }
}

