package com.studentmanagementsystem.studentmanagementsystem.repository;

import com.studentmanagementsystem.studentmanagementsystem.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

    Optional<Student> findStudentById(Long id);

    void deleteStudentById(Long id);
}
