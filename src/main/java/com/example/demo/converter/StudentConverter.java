package com.example.demo.converter;

import com.example.demo.dao.Student;
import com.example.demo.dto.StudentDto;

public class StudentConverter {
    public static StudentDto convertStudent(Student student) {
        StudentDto studentDto = new StudentDto();
        studentDto.setId(student.getId());
        studentDto.setName(student.getName());
        studentDto.setEmail(student.getEmail());
        return studentDto;
    }

    public static Student convertStudentDto(StudentDto studentDto) {
        Student student = new Student();
        student.setName(studentDto.getName());
        student.setEmail(studentDto.getEmail());
        return student;
    }
}
