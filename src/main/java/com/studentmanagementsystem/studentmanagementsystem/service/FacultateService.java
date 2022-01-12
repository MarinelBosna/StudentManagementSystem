package com.studentmanagementsystem.studentmanagementsystem.service;


import com.studentmanagementsystem.studentmanagementsystem.model.Facultate;
import com.studentmanagementsystem.studentmanagementsystem.repository.FacultateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@Transactional
public class FacultateService {

    private final FacultateRepository facultateRepository;

    @Autowired
    public FacultateService(FacultateRepository facultateRepository) {
        this.facultateRepository = facultateRepository;
    }

    public Facultate addFacultate(Facultate facultate) {
        facultate.setFacultateCode(UUID.randomUUID().toString());
        return facultateRepository.save(facultate);
    }

    public List<Facultate> findAllFacultate() {
        return facultateRepository.findAll();
    }

    public Facultate updateFacultate(Facultate facultate) {
        return facultateRepository.save(facultate);
    }

    public Optional<Facultate> findFacultateById(Long id) {
        return facultateRepository.findFacultateById(id);
    }

    public void deleteFacultate(Long id){
        facultateRepository.deleteFacultateById(id);
    }
}
