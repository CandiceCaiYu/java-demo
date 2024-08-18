package com.example.demo.service;

import com.example.demo.controller.StudentController;
import com.example.demo.converter.StudentConverter;
import com.example.demo.dao.Student;
import com.example.demo.dao.StudentRepository;
import com.example.demo.dto.StudentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

   @Autowired
    private StudentRepository studentRepository;

    @Override
    public StudentDto getStudentById(Long id) {
        Student student = studentRepository.findById(id).orElseThrow(RuntimeException::new);
        return StudentConverter.convertStudent(student);
    }

    @Override
    public Long addStudent(StudentDto studentDto) {
        List<Student> existStudent = studentRepository.findByEmail(studentDto.getEmail());
        if(!CollectionUtils.isEmpty(existStudent)) {
            throw new IllegalStateException("email"+studentDto.getEmail()+" has been token");
        }
        Student student =  studentRepository.save(StudentConverter.convertStudentDto(studentDto));
        return student.getId();
    }

    @Override
    public void deleteStudentById(Long id) {
       studentRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("id: "+ id +" doesn't not exist"));
       studentRepository.deleteById(id);
    }

}
