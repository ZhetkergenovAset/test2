package com.example.test2.service.impl;

import com.example.test2.domain.TypeInstitute;
import com.example.test2.repository.TypeInstituteRepository;
import com.example.test2.service.TypeInsituteService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TypeInstituteServiceImpl implements TypeInsituteService {
    private TypeInstituteRepository typeInstituteRepository;

    public TypeInstituteServiceImpl(TypeInstituteRepository typeInstituteRepository) {
        this.typeInstituteRepository = typeInstituteRepository;
    }

    @Override
    public TypeInstitute save(TypeInstitute type) {
        return typeInstituteRepository.save(type);
    }

    @Override
    public TypeInstitute update(TypeInstitute typeInstitute) {
        return null;
    }

    @Override
    public Optional<TypeInstitute> getById(TypeInstitute typeInstitute) {
        return Optional.empty();
    }

    @Override
    public void delete(TypeInstitute typeInstitute) {

    }
}
