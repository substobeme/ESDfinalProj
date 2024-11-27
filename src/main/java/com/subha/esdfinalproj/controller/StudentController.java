package com.subha.esdfinalproj.controller;

import com.subha.esdfinalproj.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/student")
@CrossOrigin(
        origins = "http://localhost:9003",
        methods = {RequestMethod.GET, RequestMethod.OPTIONS},
        allowedHeaders = "*",
        allowCredentials = "true"
)
public class StudentController {
    private final StudentService studentService;
    @GetMapping
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
