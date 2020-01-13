package com.authentication.userdata.service;

import com.authentication.userdata.pojo.AuthRequest;
import com.authentication.userdata.pojo.AuthResponse;

public interface AuthService {

    AuthResponse registerAuthData(AuthRequest request) throws Exception;

}
