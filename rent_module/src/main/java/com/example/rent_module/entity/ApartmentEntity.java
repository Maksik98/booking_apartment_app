package com.example.rent_module.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "apartment_info")
public class ApartmentEntity {

    @Id
    @SequenceGenerator(name="apartment_infoSequence", sequenceName="apartment_info_sequence", allocationSize = 1 , initialValue = 2)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="apartment_infoSequence")
    @Column(name = "id")
    private Long id;

    @Column(name = "rooms_count")
    private String roomsCount;

    @Column(name = "cost")
    private Double cost;

    @Column(name = "availability")
    private Boolean availability;

    @OneToOne(mappedBy = "apartment")
    private AddressEntity address;

    public ApartmentEntity(String roomsCount, Double cost) {
        this.roomsCount = roomsCount;
        this.cost = cost;
        this.availability = true;
    }
}
