package com.subha.esdfinalproj.controller;

import com.subha.esdfinalproj.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/student")
public class StudentController {
    private final StudentService studentService;
    @GetMapping("/")
    public List<Object[]> showAllStudents()
    {
        return studentService.showAllStudents();
    }
    @GetMapping("/{keyword}")
    public List<Object[]> showStudentsByKeyword(@PathVariable String keyword)
    {
        System.out.println(keyword);
        return studentService.showStudentsByKeyword(keyword);
    }

}
