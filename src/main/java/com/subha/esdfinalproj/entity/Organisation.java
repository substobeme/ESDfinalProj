package com.subha.esdfinalproj.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "organisation")
public class Organisation {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "name",unique = true)
    private String org;

    @OneToMany(mappedBy = "org")
    private List<Placement> placements;

    @OneToMany(mappedBy = "organisation")
    private List<AlumniOrganisation> alumniOrganisations;

    @Column(name = "address")
    private String address;
}
