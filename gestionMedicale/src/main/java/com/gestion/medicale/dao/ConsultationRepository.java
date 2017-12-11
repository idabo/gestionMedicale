package com.gestion.medicale.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestion.medicale.entities.Consultation;

public interface ConsultationRepository extends JpaRepository<Consultation,Long>{

}
