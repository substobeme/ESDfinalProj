package com.subha.esdfinalproj.exception;

import lombok.Getter;

@Getter
public class EmployeeNotFoundException extends RuntimeException {
    private final String errorCode;

    public EmployeeNotFoundException(String message) {
        super(message);
        this.errorCode = "EMPLOYEE_NOT_FOUND";
    }

    public EmployeeNotFoundException(String message, Throwable cause) {
        super(message, cause);
        this.errorCode = "EMPLOYEE_NOT_FOUND";
    }
}
