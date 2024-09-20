create table if not exists apartment_info(
    id INT8 PRIMARY KEY ,
    rooms_count VARCHAR,
    cost DOUBLE PRECISION,
    availability BOOLEAN
);

CREATE sequence apartment_info_sequence start 2 increment 1;

insert into apartment_info (id, rooms_count, cost, availability)
values (1 ,'3' ,2.0,true);
