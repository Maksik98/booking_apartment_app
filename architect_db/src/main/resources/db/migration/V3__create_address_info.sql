create table if not exists address_info (
    id INT8 ,
    city VARCHAR ,
    street VARCHAR ,
    house_number VARCHAR ,
    apartment_number VARCHAR ,
    address_data_registration TIMESTAMP ,
    apartment_id INT8 REFERENCES apartment_info(id)
);

create sequence address_info_sequence start 2 increment 1;

insert into address_info(id, city, street, house_number, apartment_number, address_data_registration, apartment_id)
VALUES(1,'test_city' , 'test_street', 'test_number', 'test_apartment',null, 1);