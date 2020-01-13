package com.authentication.userdata.common.exceptions;

import org.springframework.http.HttpStatus;

public class UserException extends Exception {

    private HttpStatus errorStatus;

    public UserException(HttpStatus errorStatus, String message) {
        super(message);
        this.errorStatus = errorStatus;
    }

    public HttpStatus getErrorStatus() {
        return errorStatus;
    }

}
