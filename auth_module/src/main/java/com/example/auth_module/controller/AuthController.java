package com.example.auth_module.controller;

import com.example.auth_module.dto.UserLoginRequestDto;
import com.example.auth_module.dto.UserRegistrationRequestDto;
import com.example.auth_module.service.AuthService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

import static com.example.auth_module.controller.PathConstant.AUTHORIZATION_USER;
import static com.example.auth_module.controller.PathConstant.REGISTRATION_USER;

@RestController
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping (REGISTRATION_USER)
    public String registrationNewUser (@RequestBody UserRegistrationRequestDto user){

        return authService.addUser(user);
    }

    @PostMapping(AUTHORIZATION_USER)
    public String authorizationUser (@RequestBody UserLoginRequestDto loginRequest){
        String token = authService.authorization(loginRequest);

        return token;
    }

}
