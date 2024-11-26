package com.subha.esdfinalproj.exception;


import lombok.Data;

@Data
public class EmployeeNotFoundException extends RuntimeException {
    private final String message;
}
