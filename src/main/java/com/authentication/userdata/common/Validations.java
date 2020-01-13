package com.authentication.userdata.common;

import com.authentication.userdata.common.exceptions.UserException;
import com.authentication.userdata.pojo.AuthRequest;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import static com.authentication.userdata.common.Utils.*;

@Component
public class Validations {

    public void validateUser(AuthRequest request) throws Exception {

        validateName(request.getUserName());
        validateMailId(request.getMailId());
        validatePassword(request.getPassword());

    }

    private void validateName(String userName) throws Exception {
        if (!isValidUserName(userName))
            throw new UserException(HttpStatus.NOT_ACCEPTABLE, "Invalid UserName");
    }

    private void validateMailId(String mailId) throws Exception {
        if (!isValidMailId(mailId))
            throw new UserException(HttpStatus.UNAVAILABLE_FOR_LEGAL_REASONS, "Invalid Mail ID");
    }

    private void validatePassword(String password) throws Exception {
        if(!isValidPassword(password))
            throw new UserException(HttpStatus.NON_AUTHORITATIVE_INFORMATION, "Invalid Password");
    }

}
