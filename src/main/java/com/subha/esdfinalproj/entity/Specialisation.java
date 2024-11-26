package com.subha.esdfinalproj.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "specialisation")
public class Specialisation {
    @Id
    @Column(name = "id")
    private Long id;

    @OneToMany(mappedBy = "specialisation")
    private List<PlacementFilter> placementFilters;

    @Column(name = "code")
    private String code;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "credits_required")
    private double creditsReq;

    @Column(name = "year")
    private String year;

}
