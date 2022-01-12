package com.studentmanagementsystem.studentmanagementsystem.repository;

import com.studentmanagementsystem.studentmanagementsystem.model.Facultate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface FacultateRepository extends JpaRepository<Facultate, Long> {


    Optional<Facultate> findFacultateById(Long id);

    void deleteFacultateById(Long id);
}
