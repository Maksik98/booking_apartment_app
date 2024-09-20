package com.example.rent_module.dto;


import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ApartmentRequestDto {

    private String city;

    private String street;

    private String houseNumber;

    private String apartmentNumber;

    private String roomsCount;

    private Double cost;
}
