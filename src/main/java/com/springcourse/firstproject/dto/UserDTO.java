package com.springcourse.firstproject.dto;

import java.util.List;

public class UserDTO {
    private String firstname;
    private String lastname;
    private String mobile;
    private String gender;

    private List<AddressDTO> addresses;

    public UserDTO(String firstname, String lastname, String mobile, String gender, List<AddressDTO> addresses) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.mobile = mobile;
        this.gender = gender;
        this.addresses = addresses;
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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<AddressDTO> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<AddressDTO> addresses) {
        this.addresses = addresses;
    }
}
