package com.subha.esdfinalproj.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "departments")
public class Departments {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "name",unique = true)
    private String name;

    @Column(name = "capacity")
    private Integer capacity;
}
