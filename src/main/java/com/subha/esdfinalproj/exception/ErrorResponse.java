package com.subha.esdfinalproj.exception;

import java.time.LocalDateTime;

public record ErrorResponse(
        LocalDateTime timestamp,
        int status,
        String error,
        String message,
        String errorCode,
        String path
) {}