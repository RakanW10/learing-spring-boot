package com.springcourse.firstproject.dto;

public class ContactDTO {
    private String contactName;
    private String mobile;

    public ContactDTO(String contactName, String mobile) {
        this.contactName = contactName;
        this.mobile = mobile;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}


