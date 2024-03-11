package com.partypro.praveen.service;

import java.security.Principal;

import com.partypro.praveen.dto.request.PasswordRequest;

public interface UserService {

    void forgotPassword(PasswordRequest request, Principal principal);

}
