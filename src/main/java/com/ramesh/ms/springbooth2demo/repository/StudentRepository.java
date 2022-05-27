package com.ramesh.ms.springbooth2demo.repository;

import com.ramesh.ms.springbooth2demo.entities.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface StudentRepository extends CrudRepository<Student,Integer> {
}
