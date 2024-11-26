package com.subha.esdfinalproj.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "placement")
public class Placement {

    @Id
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "organization", nullable = false)
    private Organisation organization;

    @Column(name = "profile")
    private String profile;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @Column(name = "intake")
    private Integer intake;

    @Column(name = "minimum_grade")
    private Double minimumGrade;
}