package com.example.test2.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "institute_type")
public class TypeInstitute {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "type")
    private String type;
    @Column(name = "min_score")
    private int minScore; //мин бал
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "typeInstitute")
    private List<Institute> institutes;

}
