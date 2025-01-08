package com.joe.relationships.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Addresses")
public class Address {
    @Id
    @GeneratedValue
    private Integer id;

    private String streetName;
    private String houseNumber;
    private String ZipCode;
}
