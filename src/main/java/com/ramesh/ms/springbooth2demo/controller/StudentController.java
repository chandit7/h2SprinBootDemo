package com.ramesh.ms.springbooth2demo.controller;

import com.ramesh.ms.springbooth2demo.entities.Student;
import com.ramesh.ms.springbooth2demo.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;
    @GetMapping("/students")
    private List<Student> retrieveAllUsers(){

        return  studentService.retrieveAllStudents();
    }
    @GetMapping("/student/{id}")
    private Student retriveUser(@PathVariable int id){

        return studentService.retrieveStudent(id);
    }
    @PostMapping("/students")
    private void addUsers(@RequestBody Student student){
        studentService.save(student);
    }





}
