package com.authentication.userdata;

import com.authentication.userdata.common.exceptions.UserException;
import com.authentication.userdata.pojo.AuthRequest;
import com.authentication.userdata.pojo.AuthResponse;
import com.authentication.userdata.service.AuthService;
import com.authentication.userdata.service.AuthServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @Autowired
    private AuthService authService;

    @GetMapping(value = "/test")
    public String testMethod() {
        return "I am from Authentication service";
    }

    @PostMapping(value = "/user")
    public ResponseEntity<AuthResponse> registeringUser(@RequestBody AuthRequest request) {

        /*return new ObjectMapper().writeValueAsString(request);*/
        AuthResponse authResponse = new AuthResponse();
        try {

            authResponse = this.authService.registerAuthData(request);
            return new ResponseEntity<>(authResponse, HttpStatus.OK);

        } catch (UserException userError) {

            authResponse.setStatus(false);
            authResponse.setMessage(userError.getMessage());
            return new ResponseEntity<>(authResponse, userError.getErrorStatus());

        } catch (Exception error) {

            authResponse.setStatus(false);
            authResponse.setMessage(error.getMessage());
            return new ResponseEntity<>(authResponse, HttpStatus.INTERNAL_SERVER_ERROR);

        }

    }

}
