package com.example.rent_module.repository;

import com.example.rent_module.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<UserEntity, Long> {

    UserEntity getUserEntityByNickName(String nickName);
    UserEntity getUserEntityByLogin(String login);


}
