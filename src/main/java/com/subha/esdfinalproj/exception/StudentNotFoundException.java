package com.subha.esdfinalproj.exception;

import lombok.Data;

@Data
public class StudentNotFoundException extends RuntimeException {
    private final String message;
}
