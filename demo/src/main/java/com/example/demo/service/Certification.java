package com.example.demo.service;

import com.example.demo.model.Doctor;

import java.util.List;

public interface Certification {

    Certification addCertification(Certification certifications);
    Certification updateCertification(Certification certification);
    List<Certification> getCertifications();
    Certification getCertification(Long certificationId);
    void deleteCertification(Long certificationId);
}
