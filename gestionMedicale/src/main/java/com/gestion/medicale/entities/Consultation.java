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

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Consultation implements Serializable{
	@Id
	@GeneratedValue
	private Long codeCons;
	private Date dateCons;
	private double tensionArterielle;
	private double temperature;
	private double poids;
	private String commentaireCons;
	@ManyToOne
	@JoinColumn(name="CODE_PATIENT")
	private Utilisateur utilisateurPatient;
	@ManyToOne
	@JoinColumn(name="CODE_SOIGNANT")
	private Utilisateur utilisateurSoignant;
	@OneToMany(mappedBy="consultation")
	private List<ConsSigne> consSignes;
	@OneToMany(mappedBy="consultation")
	private List<ConsMaladie> consMaladies;
	@OneToMany(mappedBy="consultation")
	private List<ConsExamen> consExamens;
	@OneToMany(mappedBy="consultation")
	private List<ConsMedicament> consMedicament;
	@ManyToOne
	@JoinColumn(name="CODE_RV")
	private RendezVous rendezVous;
	public Consultation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Consultation(Date dateCons, double tensionArterielle, double temperature, double poids,
			String commentaireCons) {
		super();
		this.dateCons = dateCons;
		this.tensionArterielle = tensionArterielle;
		this.temperature = temperature;
		this.poids = poids;
		this.commentaireCons = commentaireCons;
	}
	public Long getCodeCons() {
		return codeCons;
	}
	public void setCodeCons(Long codeCons) {
		this.codeCons = codeCons;
	}
	public Date getDateCons() {
		return dateCons;
	}
	public void setDateCons(Date dateCons) {
		this.dateCons = dateCons;
	}
	public double getTensionArterielle() {
		return tensionArterielle;
	}
	public void setTensionArterielle(double tensionArterielle) {
		this.tensionArterielle = tensionArterielle;
	}
	public double getTemperature() {
		return temperature;
	}
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	public double getPoids() {
		return poids;
	}
	public void setPoids(double poids) {
		this.poids = poids;
	}
	public String getCommentaireCons() {
		return commentaireCons;
	}
	public void setCommentaireCons(String commentaireCons) {
		this.commentaireCons = commentaireCons;
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
	@JsonIgnore
	public List<ConsSigne> getConsSignes() {
		return consSignes;
	}
	public void setConsSignes(List<ConsSigne> consSignes) {
		this.consSignes = consSignes;
	}
	@JsonIgnore
	public List<ConsMaladie> getConsMaladies() {
		return consMaladies;
	}
	public void setConsMaladies(List<ConsMaladie> consMaladies) {
		this.consMaladies = consMaladies;
	}
	@JsonIgnore
	public List<ConsExamen> getConsExamens() {
		return consExamens;
	}
	public void setConsExamens(List<ConsExamen> consExamens) {
		this.consExamens = consExamens;
	}
	@JsonIgnore
	public List<ConsMedicament> getConsMedicament() {
		return consMedicament;
	}
	public void setConsMedicament(List<ConsMedicament> consMedicament) {
		this.consMedicament = consMedicament;
	}
	public RendezVous getRendezVous() {
		return rendezVous;
	}
	public void setRendezVous(RendezVous rendezVous) {
		this.rendezVous = rendezVous;
	}
	

}
