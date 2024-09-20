package com.example.rent_module.controller;

import com.example.rent_module.dto.ApartmentRequestDto;
import com.example.rent_module.dto.RegistrationApartmentDto;
import com.example.rent_module.service.RentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import static com.example.rent_module.controller.RentConstant.REG_NEW_APARTMENT;
import static com.example.rent_module.controller.RentConstant.SHOW_APARTMENTS;

@RestController
@RequiredArgsConstructor
public class RentController {

    private final RentService rentService;

    @PostMapping(REG_NEW_APARTMENT)
    public String registrationNewApartment(@RequestBody RegistrationApartmentDto registrationApartmentDto) {
        return rentService.addNewApartment(registrationApartmentDto);
    }

    @GetMapping(SHOW_APARTMENTS)
    public ApartmentRequestDto showIdApartment(@PathVariable Long id) {

        return rentService.showApartmentById(id);
    }


}
