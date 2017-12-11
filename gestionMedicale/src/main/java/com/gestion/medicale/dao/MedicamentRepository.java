package com.gestion.medicale.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestion.medicale.entities.Medicament;

public interface MedicamentRepository extends JpaRepository<Medicament,Long>{

}
