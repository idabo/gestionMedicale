package com.gestion.medicale.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("PA")
public class Patient extends Utilisateur{

	private String sexe;
	private String etatMatrimoniale;
	private String groupeSanguin;
	private String photo;
	private String departement;
	private String allergie;
	@OneToMany(mappedBy="utilisateurPatient")
	private List<Consultation> consultations;
	
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Patient(String nomUtilisateur, String prenomUtilisateur, String telUtilisateur, String adresseUtilisateur,
			Date dateNaissUtilisateur, String emailUtilisateur, String professionUtilisateur) {
		super(nomUtilisateur, prenomUtilisateur, telUtilisateur, adresseUtilisateur, dateNaissUtilisateur, emailUtilisateur,
				professionUtilisateur);
		// TODO Auto-generated constructor stub
		this.sexe = sexe;
		this.etatMatrimoniale = etatMatrimoniale;
		this.groupeSanguin = groupeSanguin;
		this.photo = photo;
		this.departement = departement;
		this.allergie = allergie;
		this.consultations = consultations;
	}
	public Patient(String nomUtilisateur, String prenomUtilisateur) {
		super(nomUtilisateur, prenomUtilisateur);
		// TODO Auto-generated constructor stub
		this.sexe = sexe;
		this.etatMatrimoniale = etatMatrimoniale;
		this.groupeSanguin = groupeSanguin;
		this.photo = photo;
		this.departement = departement;
		this.allergie = allergie;
		this.consultations = consultations;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public String getEtatMatrimoniale() {
		return etatMatrimoniale;
	}
	public void setEtatMatrimoniale(String etatMatrimoniale) {
		this.etatMatrimoniale = etatMatrimoniale;
	}
	public String getGroupeSanguin() {
		return groupeSanguin;
	}
	public void setGroupeSanguin(String groupeSanguin) {
		this.groupeSanguin = groupeSanguin;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getDepartement() {
		return departement;
	}
	public void setDepartement(String departement) {
		this.departement = departement;
	}
	public String getAllergie() {
		return allergie;
	}
	public void setAllergie(String allergie) {
		this.allergie = allergie;
	}
	public List<Consultation> getConsultations() {
		return consultations;
	}
	public void setConsultations(List<Consultation> consultations) {
		this.consultations = consultations;
	}
	
	
}
