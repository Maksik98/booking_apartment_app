package com.example.rent_module.mapper;

import com.example.rent_module.dto.ApartmentRequestDto;
import com.example.rent_module.dto.RegistrationApartmentDto;
import com.example.rent_module.entity.AddressEntity;

public interface RentMapper {

    AddressEntity registrationApartmentDtoToAddressEntity(RegistrationApartmentDto registrationApartmentDto);

    ApartmentRequestDto addressEntityToApartmentRequestDto(AddressEntity addressEntity);
}
