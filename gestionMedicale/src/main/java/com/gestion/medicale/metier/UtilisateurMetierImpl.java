package com.gestion.medicale.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.medicale.dao.UtilisateurRepository;
import com.gestion.medicale.entities.Utilisateur;

@Service
public class UtilisateurMetierImpl implements UtilisateurMetier{
	
	@Autowired
	private UtilisateurRepository utilisateurRepositeur;

	@Override
	public Utilisateur addUtilisateur(Utilisateur u) {
		// TODO Auto-generated method stub
		return utilisateurRepositeur.save(u);
	}

	@Override
	public Utilisateur getUtilisateur(Long code) {
		// TODO Auto-generated method stub
		return utilisateurRepositeur.getOne(code);
	}

	@Override
	public Utilisateur modifyUtilisateur(Long code, Utilisateur u) {
		// TODO Auto-generated method stub
		u.setCodeUtilisateur(code);
		return utilisateurRepositeur.save(u);
	}

	@Override
	public boolean deleteUtilisateur(Long code) {
		// TODO Auto-generated method stub
		utilisateurRepositeur.delete(code);
		return true;
	}

	@Override
	public List<Utilisateur> listUtilisateur() {
		// TODO Auto-generated method stub
		return utilisateurRepositeur.findAll();
	}

	@Override
	public List<Utilisateur> utilisateurParMC(String mc) {
		// TODO Auto-generated method stub
		return null;
	}

}
