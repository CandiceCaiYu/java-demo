package com.example.demo.controller;

import com.example.demo.Response;
import com.example.demo.dao.Student;
import com.example.demo.dto.StudentDto;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/student/{id}")
    public Response<StudentDto> getStudentById(@PathVariable Long id) {
        return Response.newSuccess(studentService.getStudentById(id));
    }

    @PostMapping("/student")
    public Response<Long> addStudent(@RequestBody StudentDto studentDto) {
        return Response.newSuccess(studentService.addStudent(studentDto));
    }

    @DeleteMapping("/student/{id}")
    public Void deleteStudent(@PathVariable Long id) {
        studentService.deleteStudentById(id);
        return null;
    }
}
