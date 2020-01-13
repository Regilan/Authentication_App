package com.authentication.userdata.common;

public class Constants {

    static final String USER_NAME_REGEX = "[A-Za-z]([A-Za-z0-9]{5,})"; // Minimum 6 characters requires with start of an alphabet
    static final String MAIL_ID_REGEX = "[a-z][a-z0-9\\.]+@[a-z]{3,}\\.(com|in|org|us)"; // Valid Mail ID
    static final String PASSWORD_REGEX = "[A-Za-z \\d\\D]{6,}";

}
