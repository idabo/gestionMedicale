package com.gestion.medicale.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestion.medicale.entities.Fournisseur;

public interface FournisseurRepository extends JpaRepository<Fournisseur,Long>{

}
