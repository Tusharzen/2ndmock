package com.example.moduletest;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Student {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    @Column(name = "name", nullable = false)
    private String name ;

    @Column(name = "age", nullable = false)
    private int age ;

    @Column(name = "class", nullable = false)
    private int standard ;

    @ManyToOne
    private teacher t ;
}
