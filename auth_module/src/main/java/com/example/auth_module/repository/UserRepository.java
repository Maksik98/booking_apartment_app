package com.example.auth_module.repository;

import com.example.auth_module.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<UserEntity, Long> {

    UserEntity getUserEntityByNickName(String nickName);
    UserEntity getUserEntityByLogin(String login);

}
