package com.newgen.Student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.newgen.Student.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}