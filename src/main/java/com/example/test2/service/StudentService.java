package com.example.test2.service;

import com.example.test2.domain.Student;

import java.util.Optional;

public interface StudentService extends BaseService<Student> {

    Optional<Student> getStudentByNameAndLastName(String name,String lastName);
}
