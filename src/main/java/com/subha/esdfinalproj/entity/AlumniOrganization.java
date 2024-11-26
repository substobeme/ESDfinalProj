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
@Table(name = "alumni_organization")
public class AlumniOrganization {

    @Id
    @Column(name = "id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "organization")
    private Organisation organization;

    @ManyToOne
    @JoinColumn(name = "alumni_id")
    private Alumni alumni;

    @Column(name = "position")
    private String position;

    @Column(name = "join_date")
    private LocalDate joinDate;

    @Column(name = "leave_date")
    private LocalDate leaveDate;
}