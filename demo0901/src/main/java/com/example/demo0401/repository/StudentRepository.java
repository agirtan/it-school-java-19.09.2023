package com.example.demo0401.repository;

import com.example.demo0401.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository <Student,Long> {

    Student getStudentById(Long id);
}
