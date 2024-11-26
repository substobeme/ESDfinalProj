package com.subha.esdfinalproj.mapper;

import com.subha.esdfinalproj.dto.EmployeeRequest;
import com.subha.esdfinalproj.entity.Employee;
import org.springframework.stereotype.Service;

@Service
public class EmployeeMapper {
    public Employee toEmployee(EmployeeRequest request) {

        return Employee.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .title(request.title())
                .photographPath(request.photographPath())
                .email(request.email())
                .department(request.departmentID())
                .password(request.password())
                .build();
    }
}
