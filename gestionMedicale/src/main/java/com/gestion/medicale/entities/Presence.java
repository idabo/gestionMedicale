package com.gestion.medicale.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Presence implements Serializable{
	@Id
	@GeneratedValue
	private Long codePresence;
	private Date dateDebPresence;
	private Date dateFinPresence;
	@ManyToOne
	@JoinColumn(name="CODE_SOIGNANT")
	private Utilisateur utilisateurSoignant;
	@ManyToOne
	@JoinColumn(name="CODE_JOUR")
	private Jour jour;
	public Presence() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Presence(Date dateDebPresence, Date dateFinPresence) {
		super();
		this.dateDebPresence = dateDebPresence;
		this.dateFinPresence = dateFinPresence;
	}
	public Long getCodePresence() {
		return codePresence;
	}
	public void setCodePresence(Long codePresence) {
		this.codePresence = codePresence;
	}
	public Date getDateDebPresence() {
		return dateDebPresence;
	}
	public void setDateDebPresence(Date dateDebPresence) {
		this.dateDebPresence = dateDebPresence;
	}
	public Date getDateFinPresence() {
		return dateFinPresence;
	}
	public void setDateFinPresence(Date dateFinPresence) {
		this.dateFinPresence = dateFinPresence;
	}
	public Utilisateur getUtilisateurSoignant() {
		return utilisateurSoignant;
	}
	public void setUtilisateurSoignant(Utilisateur utilisateurSoignant) {
		this.utilisateurSoignant = utilisateurSoignant;
	}
	public Jour getJour() {
		return jour;
	}
	public void setJour(Jour jour) {
		this.jour = jour;
	}
	

}
