package com.example.test2.repository;

import com.example.test2.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student,Long> {

    Optional<Student> findByFirstNameAndLastName(String firstName,String lastName);
}
