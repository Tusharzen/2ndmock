package com.example.moduletest;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity
public class teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;

    @Column(name = "name", nullable = false)
    private String name ;

    @Column(name = "age", nullable = false)
    private int age ;
    
    @Column(name = "gender", nullable = false)
    private String gender ;

    @OneToMany(mappedBy = "t", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Student> students ;

}
