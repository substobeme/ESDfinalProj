package com.subha.esdfinalproj.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "alumni")
public class Alumni {

    @Id
    @Column(name = "id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "sid")
    private Students student;

    @Column(name = "email")
    private String email;

    @Column(name = "contact")
    private Long contact;
}