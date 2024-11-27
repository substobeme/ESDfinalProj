package com.subha.esdfinalproj.controller;

import com.subha.esdfinalproj.dto.LoginRequest;
import com.subha.esdfinalproj.service.EmployeeService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.subha.esdfinalproj.dto.AuthResponse;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/auth")
@CrossOrigin(
        origins = "http://localhost:9003",
        methods = {RequestMethod.POST, RequestMethod.OPTIONS},
        allowedHeaders = "*",
        allowCredentials = "true"
)
public class AuthenticationController {
    private final EmployeeService employeeService;

    @PostMapping("/login")
    public  ResponseEntity<AuthResponse> login(@RequestBody @Valid LoginRequest request) {
        String token = employeeService.login(request);
        return ResponseEntity.ok(new AuthResponse(token));
    }

}
