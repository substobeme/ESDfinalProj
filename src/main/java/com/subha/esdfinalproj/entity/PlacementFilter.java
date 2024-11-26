package com.subha.esdfinalproj.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "placement_filter")
public class PlacementFilter {

    @Id
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "placement_id")
    private Placement placement;

    @ManyToOne
    @JoinColumn(name = "specialisation")
    private Specialisation specialisation;

    @ManyToOne
    @JoinColumn(name = "domain")
    private Domains domain;
}