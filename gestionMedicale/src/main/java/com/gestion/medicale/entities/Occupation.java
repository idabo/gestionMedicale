package com.gestion.medicale.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Occupation implements Serializable{
	@Id
	@GeneratedValue
	private Long codeOccupation;
	@ManyToOne
	@JoinColumn(name="CODE_SOIGNANT")
	private Utilisateur utilisateurSoignant;
	@ManyToOne
	@JoinColumn(name="CODE_CALENDRIER")
	private Calendrier calendrier;
	@ManyToOne
	@JoinColumn(name="CODE_SALLE")
	private Salle salle;

	public Occupation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getCodeOccupation() {
		return codeOccupation;
	}

	public void setCodeOccupation(Long codeOccupation) {
		this.codeOccupation = codeOccupation;
	}

	public Utilisateur getUtilisateurSoignant() {
		return utilisateurSoignant;
	}

	public void setUtilisateurSoignant(Utilisateur utilisateurSoignant) {
		this.utilisateurSoignant = utilisateurSoignant;
	}

	public Calendrier getCalendrier() {
		return calendrier;
	}

	public void setCalendrier(Calendrier calendrier) {
		this.calendrier = calendrier;
	}

	public Salle getSalle() {
		return salle;
	}

	public void setSalle(Salle salle) {
		this.salle = salle;
	}
	

}
