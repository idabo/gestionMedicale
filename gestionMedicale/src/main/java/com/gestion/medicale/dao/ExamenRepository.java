package com.gestion.medicale.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestion.medicale.entities.Examen;

public interface ExamenRepository extends JpaRepository<Examen,Long>{

}
