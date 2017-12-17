package com.gestion.medicale.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("FO")
public class Fournisseur extends Utilisateur{
	
	@OneToMany(mappedBy="utilisateurFournisseur")
	private List<Livraison> livraisons;

	public Fournisseur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Fournisseur(String nomUtilisateur, String prenomUtilisateur, String telUtilisateur,
			String adresseUtilisateur, Date dateNaissUtilisateur, String emailUtilisateur,
			String professionUtilisateur) {
		super(nomUtilisateur, prenomUtilisateur, telUtilisateur, adresseUtilisateur, dateNaissUtilisateur, emailUtilisateur,
				professionUtilisateur);
		// TODO Auto-generated constructor stub
		this.livraisons = livraisons;
	}

	public Fournisseur(String nomUtilisateur, String prenomUtilisateur) {
		super(nomUtilisateur, prenomUtilisateur);
		// TODO Auto-generated constructor stub
		this.livraisons = livraisons;
	}
	


}
