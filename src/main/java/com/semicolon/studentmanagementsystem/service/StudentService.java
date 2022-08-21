package com.semicolon.studentmanagementsystem.service;

import com.semicolon.studentmanagementsystem.data.model.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudentById(Long id);

    Student updateStudent(Student student);

    void deleteStudentById(Long id);
}
