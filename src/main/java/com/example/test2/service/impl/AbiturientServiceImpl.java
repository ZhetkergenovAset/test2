package com.example.test2.service.impl;

import com.example.test2.domain.Abiturient;
import com.example.test2.repository.AbiturientRepository;
import com.example.test2.service.AbiturientService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AbiturientServiceImpl implements AbiturientService {
    private AbiturientRepository abiturientRepository;

    public AbiturientServiceImpl(AbiturientRepository abiturientRepository) {
        this.abiturientRepository = abiturientRepository;
    }

    @Override
    public Abiturient save(Abiturient abiturient) {
        return abiturientRepository.save(abiturient);
    }

    @Override
    public Abiturient update(Abiturient abiturient) {

        return abiturientRepository.save(abiturient);
    }

    @Override
    public Optional<Abiturient> getById(Abiturient abiturient) {
        return Optional.empty();
    }

    @Override
    public void delete(Abiturient abiturient) {

    }
}
