package com.gestion.medicale.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestion.medicale.entities.Livraison;

public interface LivraisonRepository extends JpaRepository<Livraison,Long>{

}
