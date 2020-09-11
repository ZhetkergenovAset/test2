package com.example.test2.service;

import com.example.test2.domain.Institute;

import java.util.List;
import java.util.Optional;

public interface InstituteService extends BaseService<Institute> {

    List<Institute> getAllInstitute();

    Optional<Institute> getInstituteById(Long id);
}
