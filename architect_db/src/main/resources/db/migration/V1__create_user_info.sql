CREATE table if not exists user_info(

    id INT8 PRIMARY KEY,
    nick_name VARCHAR,
    login VARCHAR,
    password VARCHAR,
    token VARCHAR,
    date_registration TIMESTAMP
);

CREATE sequence user_info_sequence start 2 increment 1;

insert into user_info(id,nick_name ,login , password , token , date_registration )
values (1,'test_user' , 'test_login' , 'test_password' , 'test_token' , null);

