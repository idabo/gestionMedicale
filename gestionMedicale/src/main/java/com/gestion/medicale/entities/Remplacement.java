package com.gestion.medicale.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Remplacement implements Serializable{
	@Id
	@GeneratedValue
	private Long codeRemplacement;
	@ManyToOne
	@JoinColumn(name="code_soignant")
	private Utilisateur utilisateurSoignant;
	@ManyToOne
	@JoinColumn(name="code_calendrier")
	private Calendrier calendrier;
	public Remplacement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getCodeRemplacement() {
		return codeRemplacement;
	}
	public void setCodeRemplacement(Long codeRemplacement) {
		this.codeRemplacement = codeRemplacement;
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
	

}
