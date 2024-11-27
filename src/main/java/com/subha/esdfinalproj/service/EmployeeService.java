package com.subha.esdfinalproj.service;

import com.subha.esdfinalproj.dto.EmployeeRequest;
import com.subha.esdfinalproj.dto.LoginRequest;
import com.subha.esdfinalproj.entity.Employee;
import com.subha.esdfinalproj.exception.EmployeeNotFoundException;
import com.subha.esdfinalproj.exception.AuthenticationException;
import com.subha.esdfinalproj.helper.Encryption;
import com.subha.esdfinalproj.helper.JWTHelper;
import com.subha.esdfinalproj.mapper.EmployeeMapper;
import com.subha.esdfinalproj.repo.EmployeeRepo;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class EmployeeService {
    private final EmployeeMapper employeeMapper;
    private final EmployeeRepo employeeRepo;
    private final Encryption encryption;
    private final JWTHelper jWTHelper;

    public boolean createEmployee(EmployeeRequest request) {
        Employee employee = employeeMapper.toEmployee(request);
        employee.setPassword(encryption.encode(employee.getPassword()));
        employeeRepo.save(employee);
        return true;
    }
    public Employee getEmployeeByEmail(String email) {
        return employeeRepo.findByEmail(email)
                .orElseThrow(() -> new EmployeeNotFoundException("Employee with email " + email + " not found"));
    }

    public String login(@Valid LoginRequest request) {
        // Find the employee by email
        Employee employee = getEmployeeByEmail(request.email());

        // Validate password
        if (!encryption.validates(request.password(), employee.getPassword())) {
            throw new AuthenticationException("Invalid credentials");
        }

        // Check department authorization (if required)
        if (employee.getDepartment() != 2) {
            throw new AuthenticationException("Unauthorized access");
        }

        // Generate and return token if all checks pass
        return jWTHelper.generateToken(request.email());
    }
}