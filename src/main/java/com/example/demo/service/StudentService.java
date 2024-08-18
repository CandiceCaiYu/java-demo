package com.example.demo.service;

import com.example.demo.dao.Student;
import com.example.demo.dto.StudentDto;

public interface StudentService {
    StudentDto getStudentById(Long id);
}
