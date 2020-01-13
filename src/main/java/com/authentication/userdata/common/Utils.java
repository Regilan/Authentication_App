package com.authentication.userdata.common;

public class Utils {

    static boolean isValidUserName(String userName) {
        return userName.matches(Constants.USER_NAME_REGEX);
    }

    static boolean isValidMailId(String mailId) {
        return mailId.matches(Constants.MAIL_ID_REGEX);

    }

    static boolean isValidPassword(String password){
        return password.matches(Constants.PASSWORD_REGEX);
    }
}
