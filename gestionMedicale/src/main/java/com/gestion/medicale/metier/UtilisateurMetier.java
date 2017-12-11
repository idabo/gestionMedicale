package com.gestion.medicale.metier;

import java.util.List;

import com.gestion.medicale.entities.Utilisateur;


public interface UtilisateurMetier {
	public Utilisateur addUtilisateur(Utilisateur u);
	public Utilisateur getUtilisateur(Long code);
	public Utilisateur modifyUtilisateur(Long code, Utilisateur u);
	public boolean deleteUtilisateur(Long code);
	public List<Utilisateur> listUtilisateur();
	public List<Utilisateur> utilisateurParMC(String mc);

}
