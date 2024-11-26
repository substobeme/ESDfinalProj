package com.subha.esdfinalproj.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "students")
public class Students {

    @Id
    @Column(name = "student_id")
    private Long studentId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email", unique = true, nullable = false)
    private String email;

    @Column(name = "roll_number", unique = true, nullable = false)
    private String rollNumber;

    @Column(name = "cgpa")
    private Double cgpa;

    @Column(name = "graduation_year")
    private Integer graduationYear;

    @Column(name = "total_credits")
    private Double totalCredits;

    @Column(name = "photograph_path")
    private String photographPath;

    @ManyToOne
    @JoinColumn(name = "domain")
    private Domains domain;

    @ManyToOne
    @JoinColumn(name = "specialisation_id")
    private Specialisation specialisation;

    @ManyToOne
    @JoinColumn(name = "placement_id")
    private Placement placement;
}