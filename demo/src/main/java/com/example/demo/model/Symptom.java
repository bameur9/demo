package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Symptom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Lob
    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "severity", nullable = false)
    private Integer severity;

    @Column(name = "duration", nullable = false)
    private Integer duration;

    @Column(name = "frequency")
    private String frequency;

    @Column(name = "triggering_factors")
    private String triggeringFactors;


    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

}
