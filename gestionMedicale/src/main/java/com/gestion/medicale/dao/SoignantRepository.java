package com.gestion.medicale.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestion.medicale.entities.Soignant;

public interface SoignantRepository extends JpaRepository<Soignant,Long>{

}
