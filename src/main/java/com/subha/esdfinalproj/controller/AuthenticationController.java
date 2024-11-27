package com.subha.esdfinalproj.controller;

import com.subha.esdfinalproj.dto.LoginRequest;
import com.subha.esdfinalproj.service.EmployeeService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.subha.esdfinalproj.dto.AuthResponse;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/auth")
public class AuthenticationController {
    private final EmployeeService employeeService;

    @PostMapping("/login")
    public  ResponseEntity<AuthResponse> login(@RequestBody @Valid LoginRequest request) {
        String token = employeeService.login(request);
        return ResponseEntity.ok(new AuthResponse(token));
    }

}
