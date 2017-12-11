package com.gestion.medicale.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("SO")
public class Soignant extends Utilisateur{

	private String statut;

	public Soignant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Soignant(String nomUtilisateur, String prenomUtilisateur, String telUtilisateur, String adresseUlisateur) {
		super(nomUtilisateur, prenomUtilisateur, telUtilisateur, adresseUlisateur);
		// TODO Auto-generated constructor stub
		this.statut = statut;
	}

	public Soignant(String nomUtilisateur, String prenomUtilisateur) {
		super(nomUtilisateur, prenomUtilisateur);
		// TODO Auto-generated constructor stub
		this.statut = statut;
	}

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}
	
	
}
