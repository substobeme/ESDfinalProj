package com.subha.esdfinalproj.controller;


import com.subha.esdfinalproj.dto.EmployeeRequest;
import com.subha.esdfinalproj.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/employee")
@CrossOrigin(
        origins = "http://localhost:9003",
        methods = {RequestMethod.POST, RequestMethod.OPTIONS},
        allowedHeaders = "*",
        allowCredentials = "true"
)
public class EmployeeController {
    private final EmployeeService employeeService;

    @PostMapping("/")
    public ResponseEntity<String> createEmployee(@RequestBody EmployeeRequest request)
    {
        boolean isCreated = employeeService.createEmployee(request);
        String res;
        if(isCreated)
        {
            res = "Employee created successfully";
        }
        else
        {
            res = "Employee creation failed";
        }
        return ResponseEntity.ok(res);
    }
}
