package com.joe.relationships.entity;

import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name = "departments")
public class Department {
    @Id
    @GeneratedValue
    private Integer id;


     @Column(nullable = false,unique = true)
     private String title;


    @OneToMany(mappedBy = "department")
    private List<Employee> employees;
}
