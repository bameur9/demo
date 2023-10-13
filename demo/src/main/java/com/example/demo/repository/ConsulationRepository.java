package com.example.demo.repository;


import com.example.demo.model.Consultation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsulationRepository extends JpaRepository<Consultation, Long> {
}
