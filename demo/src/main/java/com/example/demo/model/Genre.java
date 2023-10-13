package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "genre_type", unique = true)
    private String genreType;

    @ToString.Exclude
    @OneToMany(mappedBy = "genre", orphanRemoval = true)
    private List<Patient> patients = new ArrayList<>();

    @ToString.Exclude
    @OneToMany(mappedBy = "genre", orphanRemoval = true)
    private List<Doctor> doctors = new ArrayList<>();

}
