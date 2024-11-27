package com.subha.esdfinalproj.exception;

import lombok.Getter;

@Getter
public class StudentNotFoundException extends RuntimeException {
    private final String errorCode;

    public StudentNotFoundException(String message) {
        super(message);
        this.errorCode = "STUDENT_NOT_FOUND";
    }

    public StudentNotFoundException(String message, Throwable cause) {
        super(message, cause);
        this.errorCode = "STUDENT_NOT_FOUND";
    }
}
