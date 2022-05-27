package com.ramesh.ms.springbooth2demo.services;

import com.ramesh.ms.springbooth2demo.entities.Student;
import com.ramesh.ms.springbooth2demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentService {
    @Autowired
    StudentRepository sr;
    public List<Student> retrieveAllStudents() {

      return (List<Student>) sr.findAll();
    }

    public void save(Student student) {
        sr.save(student);
        //return student;
    }

    public Student retrieveStudent(int id) {
       return (Student) sr.findById(id).get();
    }

}
