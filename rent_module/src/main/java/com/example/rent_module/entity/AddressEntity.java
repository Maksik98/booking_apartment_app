package com.example.rent_module.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@Table(name = "address_info")
public class AddressEntity {

    @Id
    @SequenceGenerator(name="address_infoSequence", sequenceName="address_info_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="address_infoSequence")
    @Column(name = "id")
    private Long id;

    @Column(name = "city")
    private String city;

    @Column(name = "street")
    private String street;

    @Column(name = "house_number")
    private String houseNumber;

    @Column(name = "apartment_number")
    private String apartmentNumber;

    @Column(name = "address_data_registration")
    private LocalDateTime addressDataRegistration;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "apartment_id")
    private ApartmentEntity apartment;

    public AddressEntity(String street, String city, String apartmentNumber,String houseNumber) {
        this.street = street;
        this.city = city;
        this.addressDataRegistration = LocalDateTime.now();
        this.apartmentNumber = apartmentNumber;
        this.houseNumber = houseNumber;
    }
}
