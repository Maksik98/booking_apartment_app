package com.example.auth_module.dto;

import lombok.Data;

@Data
public class UserLoginRequestDto {
   private String login;
   private String password;
}
