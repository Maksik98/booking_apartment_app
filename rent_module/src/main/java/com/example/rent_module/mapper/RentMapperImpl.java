package com.example.rent_module.mapper;

import com.example.rent_module.dto.ApartmentRequestDto;
import com.example.rent_module.dto.RegistrationApartmentDto;
import com.example.rent_module.entity.AddressEntity;
import com.example.rent_module.entity.ApartmentEntity;
import org.springframework.stereotype.Component;

@Component
public class RentMapperImpl implements RentMapper {



    @Override
    public AddressEntity registrationApartmentDtoToAddressEntity(RegistrationApartmentDto dto) {

        ApartmentEntity apartmentEntity = new ApartmentEntity(dto.getRoomsCount(), dto.getCost() );

        AddressEntity addressEntity = new AddressEntity(dto.getStreet(), dto.getCity(), dto.getApartmentNumber(), dto.getHouseNumber());

        addressEntity.setApartment(apartmentEntity);
        return addressEntity;
    }

    @Override
    public ApartmentRequestDto addressEntityToApartmentRequestDto(AddressEntity addressEntity) {


        return new ApartmentRequestDto(addressEntity.getCity(), addressEntity.getStreet(),
                addressEntity.getHouseNumber(),
                addressEntity.getApartmentNumber(),
                addressEntity.getApartment().getRoomsCount(),
                addressEntity.getApartment().getCost());
    }


}
