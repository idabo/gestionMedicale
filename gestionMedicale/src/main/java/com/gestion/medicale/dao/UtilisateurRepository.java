package com.gestion.medicale.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.gestion.medicale.entities.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur,Long>{
	@Query("select u from Utilisateur u where u.prenom like :x")
	public List<Utilisateur> utilisateursParMC(@Param("x")String mc);

}
