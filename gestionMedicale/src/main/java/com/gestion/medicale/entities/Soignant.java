package com.gestion.medicale.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("SO")
public class Soignant extends Utilisateur{

	private String statut;
	@OneToMany(mappedBy="utilisateurSoignant")
	private List<Consultation> consultations;
	
	public Soignant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Soignant(String nomUtilisateur, String prenomUtilisateur, String telUtilisateur, String adresseUtilisateur,
			Date dateNaissUtilisateur, String emailUtilisateur, String professionUtilisateur) {
		super(nomUtilisateur, prenomUtilisateur, telUtilisateur, adresseUtilisateur, dateNaissUtilisateur, emailUtilisateur,
				professionUtilisateur);
		// TODO Auto-generated constructor stub
		this.statut = statut;
		this.consultations = consultations;
	}
	public Soignant(String nomUtilisateur, String prenomUtilisateur) {
		super(nomUtilisateur, prenomUtilisateur);
		// TODO Auto-generated constructor stub
		this.statut = statut;
		this.consultations = consultations;
	}
	public String getStatut() {
		return statut;
	}
	public void setStatut(String statut) {
		this.statut = statut;
	}
	public List<Consultation> getConsultations() {
		return consultations;
	}
	public void setConsultations(List<Consultation> consultations) {
		this.consultations = consultations;
	}

	
	
}
