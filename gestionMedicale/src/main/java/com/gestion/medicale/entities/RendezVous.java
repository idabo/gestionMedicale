package com.gestion.medicale.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class RendezVous implements Serializable{
	@Id
	@GeneratedValue
	private Long codeRV;
	private Date dateRV;
	private double dureeRV;
	@ManyToOne
	@JoinColumn(name="CODE_PATIENT")
	private Utilisateur utilisateurPatient;
	@ManyToOne
	@JoinColumn(name="CODE_SOIGNANT")
	private Utilisateur utilisateurSoignant;
	@ManyToOne
	@JoinColumn(name="CODE_SECRETAIRE")
	private Utilisateur utilisateurSecretaire;
	@OneToMany(mappedBy="rendezVous")
	private List<Consultation> consultations;
	public RendezVous() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RendezVous(Date dateRV, double dureeRV) {
		super();
		this.dateRV = dateRV;
		this.dureeRV = dureeRV;
	}
	public RendezVous(Date dateRV, double dureeRV, Utilisateur utilisateurPatient, Utilisateur utilisateurSoignant,
			Utilisateur utilisateurSecretaire, List<Consultation> consultations) {
		super();
		this.dateRV = dateRV;
		this.dureeRV = dureeRV;
		this.utilisateurPatient = utilisateurPatient;
		this.utilisateurSoignant = utilisateurSoignant;
		this.utilisateurSecretaire = utilisateurSecretaire;
		this.consultations = consultations;
	}
	public Long getCodeRV() {
		return codeRV;
	}
	public void setCodeRV(Long codeRV) {
		this.codeRV = codeRV;
	}
	public Date getDateRV() {
		return dateRV;
	}
	public void setDateRV(Date dateRV) {
		this.dateRV = dateRV;
	}
	public double getDureeRV() {
		return dureeRV;
	}
	public void setDureeRV(double dureeRV) {
		this.dureeRV = dureeRV;
	}
	public Utilisateur getUtilisateurPatient() {
		return utilisateurPatient;
	}
	public void setUtilisateurPatient(Utilisateur utilisateurPatient) {
		this.utilisateurPatient = utilisateurPatient;
	}
	public Utilisateur getUtilisateurSoignant() {
		return utilisateurSoignant;
	}
	public void setUtilisateurSoignant(Utilisateur utilisateurSoignant) {
		this.utilisateurSoignant = utilisateurSoignant;
	}
	public Utilisateur getUtilisateurSecretaire() {
		return utilisateurSecretaire;
	}
	public void setUtilisateurSecretaire(Utilisateur utilisateurSecretaire) {
		this.utilisateurSecretaire = utilisateurSecretaire;
	}
	public List<Consultation> getConsultations() {
		return consultations;
	}
	public void setConsultations(List<Consultation> consultations) {
		this.consultations = consultations;
	}
	

}
