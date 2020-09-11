package com.example.test2.service.impl;

import com.example.test2.domain.Institute;
import com.example.test2.repository.InstituteRepository;
import com.example.test2.service.InstituteService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InstituteServiceImpl implements InstituteService {
    private InstituteRepository instituteRepository;

    public InstituteServiceImpl(InstituteRepository instituteRepository) {
        this.instituteRepository = instituteRepository;
    }

    @Override
    public Institute save(Institute institute) {
        return instituteRepository.save(institute);
    }

    @Override
    public Institute update(Institute institute) {
        return null;
    }

    @Override
    public Optional<Institute> getById(Institute institute) {
        return Optional.empty();
    }

    @Override
    public void delete(Institute institute) {

    }

    @Override
    public Optional<Institute> getInstituteById(Long id) {
        return instituteRepository.findById(id);
    }

    @Override
    public List<Institute> getAllInstitute() {
        return instituteRepository.findAll();
    }
}
