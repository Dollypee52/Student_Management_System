package com.semicolon.studentmanagementsystem.data.repository;

import com.semicolon.studentmanagementsystem.data.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
