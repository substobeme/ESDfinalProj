package com.subha.esdfinalproj.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "alumni")
public class Alumni {
    @Id
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @OneToMany(mappedBy = "alumni")
    private List<AlumniOrganisation> alumniOrganisations;

    @Column(name = "email")
    private String email;

    @Column(name = "contact")
    private long contact;

}
