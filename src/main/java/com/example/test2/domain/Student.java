package com.example.test2.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "students")
@ToString(exclude = {"abiturient"})
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "total_score")
    private int totalScore; //бал
    @OneToOne(fetch = FetchType.EAGER,mappedBy = "student")
    private Abiturient abiturient;

}
