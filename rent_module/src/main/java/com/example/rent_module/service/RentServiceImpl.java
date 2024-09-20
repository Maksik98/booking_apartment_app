package com.example.rent_module.service;

import com.example.rent_module.dto.ApartmentRequestDto;
import com.example.rent_module.dto.RegistrationApartmentDto;
import com.example.rent_module.entity.AddressEntity;
import com.example.rent_module.entity.ApartmentEntity;
import com.example.rent_module.mapper.RentMapperImpl;
import com.example.rent_module.repository.AddressRepository;
import com.example.rent_module.repository.ApartmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RentServiceImpl implements RentService {

    private final RentMapperImpl rentMapper;
    private final AddressRepository addressRepository;
    private final ApartmentRepository apartmentRepository;

    public final static String APARTMENT_ERROR_MESSAGE = "Апартаменты недоступны!";

    @Override
    public String addNewApartment(RegistrationApartmentDto registrationApartmentDto) {

        AddressEntity addressEntity = rentMapper.registrationApartmentDtoToAddressEntity(registrationApartmentDto);
        addressRepository.save(addressEntity);

        return "Апартаменты успешно зарегистрированы!";
    }

    @Override
    public ApartmentRequestDto showApartmentById(Long id) {

        ApartmentEntity apartmentEntity = apartmentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException(APARTMENT_ERROR_MESSAGE));

        return rentMapper.addressEntityToApartmentRequestDto(apartmentEntity.getAddress());
    }

}
