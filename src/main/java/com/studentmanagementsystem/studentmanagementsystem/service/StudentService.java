package com.studentmanagementsystem.studentmanagementsystem.service;


import com.studentmanagementsystem.studentmanagementsystem.exceptions.StudentNotFoundException;
import com.studentmanagementsystem.studentmanagementsystem.model.Student;
import com.studentmanagementsystem.studentmanagementsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student addStudent(Student student) {
        student.setStudentCode(UUID.randomUUID().toString());
        return studentRepository.save(student);
    }

    public List<Student> findAllStudents() {
        return studentRepository.findAll();
    }

    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student findStudentById(Long id) {
        return studentRepository.findStudentById(id)
                .orElseThrow(() -> new StudentNotFoundException("User by id " + id + " was not found"));
    }

    public void deleteStudent(Long id){
        studentRepository.deleteStudentById(id);
    }
}
