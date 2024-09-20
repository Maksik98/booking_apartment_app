package com.example.auth_module.service;

import com.example.auth_module.dto.UserLoginRequestDto;
import com.example.auth_module.dto.UserRegistrationRequestDto;

public interface AuthService {

    public String addUser(UserRegistrationRequestDto user);
    public String authorization(UserLoginRequestDto login);
}
