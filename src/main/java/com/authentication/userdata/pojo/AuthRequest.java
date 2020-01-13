package com.authentication.userdata.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AuthRequest {

    private String userName;
    private String mailId;
    private String password;

    public String getUserName() {
        return userName;
    }

    @JsonProperty("user_name")
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMailId() {
        return mailId;
    }

    @JsonProperty("mail_id")
    public void setMailId(String mailId) {
        this.mailId = mailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
