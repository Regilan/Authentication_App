package com.authentication.userdata.service;

import com.authentication.userdata.common.Validations;
import com.authentication.userdata.pojo.AuthRequest;
import com.authentication.userdata.pojo.AuthResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Autowired
    private Validations validations;

    @Override
    public AuthResponse registerAuthData(AuthRequest request) throws Exception {

        AuthResponse authResponse = new AuthResponse();
        this.validations.validateUser(request);

        authResponse.setStatus(true);
        authResponse.setMessage("Successful Input");
        return authResponse;
    }

}
