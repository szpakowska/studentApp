package com.example.studentapp.controller;

import com.example.studentapp.model.StudentModel;
import com.example.studentapp.service.StudentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
public class StudentController {

    private final StudentService studentService;


    @GetMapping("/students")
    public List<StudentModel> getStudentList() {
        return studentService.getStudentList();

    }

    @PostMapping("/students")
    public void postAddStudent(@RequestParam String firstName) {
        studentService.addStudent(firstName, null, null, null);

    }

}
