package com.joe.relationships.entity;

import jakarta.persistence.*;
import org.springframework.data.repository.cdi.Eager;

import java.util.List;

@Entity
@Table(name = "missions")
public class Mission {

    @Id
    @GeneratedValue
    private Integer id;

    private String title;

    private float duration;


    @ManyToMany(mappedBy = "missions")
    private List<Employee > employees;
}
