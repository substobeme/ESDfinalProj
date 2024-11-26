package com.subha.esdfinalproj.entity;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "alumni_organisation")
public class AlumniOrganisation {

    @Id
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "organisation",referencedColumnName = "name")
    private Organisation organisation;

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
