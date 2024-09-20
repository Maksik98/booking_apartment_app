package com.example.rent_module.service;

import com.example.rent_module.dto.ApartmentRequestDto;
import com.example.rent_module.dto.RegistrationApartmentDto;


public interface RentService {

    public String addNewApartment(RegistrationApartmentDto registrationApartmentDto);

    public ApartmentRequestDto showApartmentById(Long id);


}
