package com.partypro.praveen.service;

import java.io.IOException;

import com.partypro.praveen.dto.request.LoginRequest;
import com.partypro.praveen.dto.request.RegisterRequest;
import com.partypro.praveen.dto.response.LoginResponse;
import com.partypro.praveen.dto.response.RegisterResponse;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public interface AuthenticationService {
    RegisterResponse register(RegisterRequest request);

    LoginResponse login(LoginRequest request);

    void refreshToken(HttpServletRequest request, HttpServletResponse response) throws IOException;
}
