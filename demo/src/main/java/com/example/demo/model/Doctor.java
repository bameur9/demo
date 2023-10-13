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
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "picture")
    private String picture;

    @Column(name = "password")
    private String password;


    @OneToOne(orphanRemoval = true)
    @JoinColumn(name = "address_id")
    private Address address;

    @OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Certification> certifications = new ArrayList<>();

    @Column(name = "is_certified")
    private Boolean isCertified;

    @ManyToOne
    @JoinColumn(name = "genre_id")
    private Genre genre;

    @OneToMany(mappedBy = "doctor", orphanRemoval = true)
    private List<Consultation> consultations = new ArrayList<>();

    public void addCertification(Certification certification) {
        certification.setDoctor(this);
        certifications.add(certification);
    }

    public void removeCertification(Certification certification) {
        certifications.remove(certification);
        certification.setDoctor(null);
    }




}
