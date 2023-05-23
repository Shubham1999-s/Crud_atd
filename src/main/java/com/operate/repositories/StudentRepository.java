package com.operate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.operate.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
