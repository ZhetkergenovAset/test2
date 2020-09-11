package com.example.test2.service.impl;

import com.example.test2.domain.Student;
import com.example.test2.repository.StudentRepository;
import com.example.test2.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student update(Student student) {
        return null;
    }

    @Override
    public Optional<Student> getById(Student student) {
        return Optional.empty();
    }

    @Override
    public void delete(Student student) {

    }

    @Override
    public Optional<Student> getStudentByNameAndLastName(String name, String lastName) {
        if(name!=null&&name.length()>0){
            if(lastName!=null&&lastName.length()>0){
                return studentRepository.findByFirstNameAndLastName(name,lastName);
            }
        }
        return Optional.empty();
    }
}
