package com.gestion.medicale.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="CONS_SIGNE")
	private Collection<Signe> signes;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="CONS_MALADIE")
	private Collection<Maladie> maladies;
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
	public Consultation(Date dateCons, double tensionArterielle, double ttemperature, double poids,
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
	public Collection<Signe> getSignes() {
		return signes;
	}
	public void setSignes(Collection<Signe> signes) {
		this.signes = signes;
	}
	public Collection<Maladie> getMaladies() {
		return maladies;
	}
	public void setMaladies(Collection<Maladie> maladies) {
		this.maladies = maladies;
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
