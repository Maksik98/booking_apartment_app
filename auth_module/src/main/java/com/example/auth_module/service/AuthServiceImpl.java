package com.example.auth_module.service;

import com.example.auth_module.dto.UserLoginRequestDto;
import com.example.auth_module.dto.UserRegistrationRequestDto;
import com.example.auth_module.entity.UserEntity;
import com.example.auth_module.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

import static java.util.Objects.isNull;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    public final UserRepository userRepository;

    public final static String SAVE_USER_MESSAGE = "Новый пользователь сохранен!";
    public final static String MESSAGE_THROW_NICK_NAME = "Пользователь с таким никнеймом уже зарегистрирован!";
    public final static String MESSAGE_THROW_LOGIN = "Пользователь с таким логином уже зарегистрирован!";
    public final static String MESSAGE_THROW_AUTHORIZATION = "Пользователь не найден!";
    @Override
    public String addUser(UserRegistrationRequestDto user) {

            if (!isNull(userRepository.getUserEntityByNickName(user.getNickName()))){
                throw new RuntimeException(MESSAGE_THROW_NICK_NAME);
            }

            if (!isNull(userRepository.getUserEntityByLogin(user.getLogin()))){
                throw new RuntimeException(MESSAGE_THROW_LOGIN);
            }
        UserEntity userEntity = new UserEntity(user.getLogin(), user.getNickName(), user.getPassword());
        userRepository.save(userEntity);
        return SAVE_USER_MESSAGE;
    }

    @Override
    public String authorization(UserLoginRequestDto login) {
        UserEntity userEntity = userRepository.getUserEntityByLogin(login.getLogin());
        if (!isNull(userRepository.getUserEntityByLogin(login.getLogin()))){
            throw new RuntimeException(MESSAGE_THROW_AUTHORIZATION);
        }
        String token = UUID.randomUUID().toString();
        userEntity.setToken(token);
        userRepository.save(userEntity);

        return token;
    }
}

