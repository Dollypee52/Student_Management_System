package com.semicolon.studentmanagementsystem.service;

import com.semicolon.studentmanagementsystem.data.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentServiceImplTest {
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private StudentServiceImpl studentService;


}