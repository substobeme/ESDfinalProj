package com.subha.esdfinalproj.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
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
    private Students student;

    @Column(name = "cv_application")
    private String cvApplication;

    @Column(name = "about", columnDefinition = "TEXT")
    private String about;

    @Column(name = "acceptance")
    private String acceptance;

    @Column(name = "comments", columnDefinition = "TEXT")
    private String comments;

    @Column(name = "date")
    private LocalDate date;
}