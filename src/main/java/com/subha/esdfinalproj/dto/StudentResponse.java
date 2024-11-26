package com.subha.esdfinalproj.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.subha.esdfinalproj.entity.Domains;
import com.subha.esdfinalproj.entity.Specialisation;

public record StudentResponse(
        @JsonProperty("first_name")
        String firstName,

        @JsonProperty("last_name")
        String lastName,

        @JsonProperty("email")
        String email,

        @JsonProperty("domain")
        Domains domain,

        @JsonProperty("graduation_year")
        int gradYear,

        @JsonProperty("org")
        String organization,

        @JsonProperty("specialisation")
        Specialisation specialisation
) {
}
