package com.subha.esdfinalproj.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "placement_student")
public class PlacementStudent {

    @Id
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "placement_id")
    private Placement placement;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @Column(name = "cv_application")
    private String cvApp;

    @Column(name = "about")
    private String about;

    @Column(name = "acceptance")
    private String acceptance;

    @Column(name = "comments")
    private String comments;

    @Column(name = "date")
    private LocalDate date;

}
