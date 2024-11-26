package com.subha.esdfinalproj.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "domains")
public class Domains {

    @Id
    @Column(name = "domain_id")
    private Long domainId;

    @Column(name = "program")
    private String program;

    @Column(name = "batch")
    private String batch;

    @Column(name = "capacity")
    private Integer capacity;

    @Column(name = "qualification")
    private String qualification;
}