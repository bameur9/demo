package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "firstname", nullable = false)
    private String firstname;

    @Column(name = "lastname", nullable = false)
    private String lastname;

    @Column(name = "email", unique = true, nullable = false)
    private String email;

    @Column(name = "picture",nullable = false)
    private String picture;

    @Column(name = "password", nullable = false)
    private String password;


    @Column(name = "age")
    private Integer age;

    @Column(name = "height")
    private Integer height;

    @Column(name = "weight")
    private Integer weight;

    @OneToOne(orphanRemoval = true)
    @JoinColumn(name = "address_id", nullable = false)
    private Address address;

    @Column(name = "consulted", nullable = false)
    private Boolean consulted = false;


    @ManyToOne
    @JoinColumn(name = "genre_id")
    private Genre genre;

    @OneToMany(mappedBy = "patient", orphanRemoval = true)
    private List<Symptom> symptoms = new ArrayList<>();

    @OneToMany(mappedBy = "patient", orphanRemoval = true)
    private List<Consultation> consultations = new ArrayList<>();

}
