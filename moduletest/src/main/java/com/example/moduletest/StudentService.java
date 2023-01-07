package com.example.moduletest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepo ;

    public void addStudent(Student student){
        studentRepo.save(student) ;
    }
    
    public Student getStudent(int id){
        Student student = studentRepo.findById(id).get() ;
        return student ;
    }
    
}
