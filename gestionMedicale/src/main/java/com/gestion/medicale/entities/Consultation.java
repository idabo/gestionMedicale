package com.gestion.medicale.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Consultation implements Serializable{
	@Id
	@GeneratedValue
	private Long codeCons;
	private Date dateCons;
	private double tensionArterielle;
	private double temperateur;
	private double poids;
	private String commentaireCons;
	@ManyToOne
	@JoinColumn(name="CODE_UTILISATEUR")
	private Utilisateur utilisateur;
	@ManyToMany
	@JoinTable(name="CONS_SIGNE")
	private Collection<Signe> signes;
	@ManyToMany
	@JoinTable(name="CONS_MALADIE")
	private Collection<Maladie> maladies;
	@OneToMany(mappedBy="consultation")
	private List<ConsExamen> consExamens;
	@OneToMany(mappedBy="consultation")
	private List<ConsMedicament> consMedicament;
	public Consultation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Consultation(Date dateCons, double tensionArterielle, double temperateur, double poids,
			String commentaireCons) {
		super();
		this.dateCons = dateCons;
		this.tensionArterielle = tensionArterielle;
		this.temperateur = temperateur;
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
	public double getTemperateur() {
		return temperateur;
	}
	public void setTemperateur(double temperateur) {
		this.temperateur = temperateur;
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

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
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
	public List<ConsExamen> getConsExamens() {
		return consExamens;
	}
	public void setConsExamens(List<ConsExamen> consExamens) {
		this.consExamens = consExamens;
	}
	public List<ConsMedicament> getConsMedicament() {
		return consMedicament;
	}
	public void setConsMedicament(List<ConsMedicament> consMedicament) {
		this.consMedicament = consMedicament;
	}
	

}
