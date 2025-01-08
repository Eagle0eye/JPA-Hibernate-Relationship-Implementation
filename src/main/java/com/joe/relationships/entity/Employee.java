package com.joe.relationships.entity;


import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(
            nullable = false,
            unique = true
    )
    private String Identifier;


    @Column(
            nullable = false
    )
    private String firstName;


    @Column(
            nullable = false
    )
    private String lastName;


    @Column(
            nullable = false,
            unique = true
    )
    private String email;

    @Column(
            nullable = false
    )
    private LocalDate birthday;

    @Enumerated(
            EnumType.STRING
    )
    @Column(
            nullable = false
    )
    private EmployeeRole role;


    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;


    @ManyToMany
    @JoinTable(name = "empl",
    joinColumns = @JoinColumn(name = "employee_id"),
    inverseJoinColumns = @JoinColumn(name = "mission_id"))
    private List<Mission> missions;

}
