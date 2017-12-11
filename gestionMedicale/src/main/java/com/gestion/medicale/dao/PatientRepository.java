package com.gestion.medicale.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestion.medicale.entities.Patient;

public interface PatientRepository extends JpaRepository<Patient,Long>{

}
