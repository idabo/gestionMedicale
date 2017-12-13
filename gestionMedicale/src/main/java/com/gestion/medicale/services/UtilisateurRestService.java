package com.gestion.medicale.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.medicale.entities.Utilisateur;
import com.gestion.medicale.metier.UtilisateurMetier;

@RestController
@CrossOrigin("*")
public class UtilisateurRestService {
	@Autowired
	private UtilisateurMetier utilisateurMetier;
	
    @RequestMapping(value="/utilisateurs",method=RequestMethod.POST)
	public Utilisateur addUtilisateur(@RequestBody Utilisateur u) {
		return utilisateurMetier.addUtilisateur(u);
	}
    @RequestMapping(value="/utilisateurs/{code}",method=RequestMethod.GET)
	public Utilisateur getUtilisateur(@PathVariable Long code) {
		return utilisateurMetier.getUtilisateur(code);
	}
    @RequestMapping(value="/utilisateurs/{code}",method=RequestMethod.PUT)
	public Utilisateur modifyUtilisateur(@PathVariable Long code, @RequestBody Utilisateur u) {
		return utilisateurMetier.modifyUtilisateur(code, u);
	}
    @RequestMapping(value="/utilisateurs/{code}",method=RequestMethod.DELETE)
	public boolean deleteUtilisateur(@PathVariable Long code) {
		return utilisateurMetier.deleteUtilisateur(code);
	}
    @RequestMapping(value="/utilisateurs",method=RequestMethod.GET)
	public List<Utilisateur> listUtilisateur() {
		return utilisateurMetier.listUtilisateur();
	}

	public List<Utilisateur> utilisateurParMC(String mc) {
		return utilisateurMetier.utilisateurParMC(mc);
	}

}
