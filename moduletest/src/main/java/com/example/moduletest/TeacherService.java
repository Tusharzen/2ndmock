package com.example.moduletest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {
    
    @Autowired
    TeacherRepository teacherRepo ;

    public void addTeacher(teacher t){
        teacherRepo.save(t) ;
    }
    
    public teacher getTeacher(int id){
        teacher t = teacherRepo.findById(id).get() ;
        return t ;
    }
}
