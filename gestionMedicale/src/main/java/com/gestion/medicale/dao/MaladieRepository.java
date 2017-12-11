package com.gestion.medicale.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestion.medicale.entities.Maladie;

public interface MaladieRepository extends JpaRepository<Maladie,Long>{

}
