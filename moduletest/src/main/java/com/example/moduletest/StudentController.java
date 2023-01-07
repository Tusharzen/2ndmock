package com.example.moduletest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    
    @Autowired
    StudentService studentService;

    @Autowired
    TeacherService teacherService ;

    @PostMapping("/student/add_student")
    public void addStudent(@RequestBody Student student)
    {
        studentService.addStudent(student);
    }
    
    @PostMapping("/teacher/add_teacher")
    public void addTeacher(@RequestBody teacher t1)
    {
        teacherService.addTeacher(t1);
    }

    @GetMapping("/student/get_student/{id}")
    public Student getStudentById(@PathVariable int id)
    {
        Student student = studentService.getStudent(id) ;
        return student ;
    }

    @GetMapping("/teacher")
    public teacher getTeacherById(@RequestParam int id)
    {
        teacher t1 = teacherService.getTeacher(id) ;
        return t1 ;
    }

}
