package com.example.auth_module.dto;

import lombok.Data;

@Data
public class UserRegistrationRequestDto {

    private String nickName;
    private String login;
    private String password;
}
