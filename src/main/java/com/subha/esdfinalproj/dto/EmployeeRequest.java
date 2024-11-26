package com.subha.esdfinalproj.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.*;

public record EmployeeRequest(
        @JsonProperty("first_name")
        String firstName,

        @JsonProperty("last_name")
        String lastName,

        @JsonProperty("title")
        String title,

        @JsonProperty("photograph_path")
        String photographPath,

        @JsonProperty("department")
        Long departmentID,

        @NotNull(message = "email required")
        @Email(message = "email required")
        @JsonProperty("email")
        String email,

        @NotNull(message = "Password should be present")
        @NotEmpty(message = "Password should be present")
        @NotBlank(message = "Password should be present")
        @Size(min = 6, max = 12)
        @JsonProperty("password")
        String password
) {
}
