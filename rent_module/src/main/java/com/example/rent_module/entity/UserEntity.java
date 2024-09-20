package com.example.rent_module.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@Table(name = "user_info")
public class UserEntity {

    @Id
    @SequenceGenerator(name="user_infoSequence", sequenceName="user_info_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="user_infoSequence")
    @Column(name = "id")
    private Long id;

    @Column(name = "nick_name")
    private String nickName;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;

    @Column(name = "token")
    private String token;

    @Column(name = "date_registration")
    private LocalDateTime dateRegistration;

    public UserEntity(String login, String nickName, String password){
        this.login = login;
        this.nickName = nickName;
        this.password = password;
        this.dateRegistration = LocalDateTime.now();
    }
}
