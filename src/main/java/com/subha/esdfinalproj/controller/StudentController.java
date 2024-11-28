package com.subha.esdfinalproj.controller;

import com.subha.esdfinalproj.exception.AuthenticationException;
import com.subha.esdfinalproj.helper.JWTHelper;
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
    private final JWTHelper jwtHelper;
    @GetMapping
    public List<Object[]> showAllStudents(@RequestHeader(value="Authorization") String authHeader)
   {

       if (authHeader != null && authHeader.startsWith("Bearer ")) {
           String jwtToken = authHeader.substring(7);
           String email = jwtHelper.extractUsername(jwtToken);

           if (email != null && jwtHelper.validateToken(jwtToken,email)) {
               return studentService.showAllStudents();
           } else {
               throw new AuthenticationException("Invalid or expired token.");
           }
       } else {
           throw new AuthenticationException("Authorization header is missing or invalid.");
       }
    }

    @GetMapping("/{keyword}")
    public List<Object[]> showStudentsByKeyword(@RequestHeader(value="Authorization") String authHeader,@PathVariable String keyword)
    {

        if (authHeader != null && authHeader.startsWith("Bearer ")) {
            String jwtToken = authHeader.substring(7);
            String email = jwtHelper.extractUsername(jwtToken);

            if (email != null && jwtHelper.validateToken(jwtToken,email)) {
                System.out.println(keyword);
                return studentService.showStudentsByKeyword(keyword);
            } else {
                throw new AuthenticationException("Invalid or expired token.");
            }
        } else {
            throw new AuthenticationException("Authorization header is missing or invalid.");
        }

    }

}