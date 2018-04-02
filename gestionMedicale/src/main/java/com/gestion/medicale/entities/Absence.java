package com.gestion.medicale.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Absence implements Serializable{
	@Id
	@GeneratedValue
	private Long codeAbsence;
	@ManyToOne
	@JoinColumn(name="CODE_SOIGNANT")
	private Utilisateur utilisateurSoignant;
	@ManyToOne
	@JoinColumn(name="code_calendrier")
	private Calendrier calendrier;
	public Absence() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getCodeAbsence() {
		return codeAbsence;
	}
	public void setCodeAbsence(Long codeAbsence) {
		this.codeAbsence = codeAbsence;
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
