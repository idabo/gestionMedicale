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
public class Exemplaire implements Serializable{
	@Id
	@GeneratedValue
	private Long codeExemplaire;
	private Date dateFabrication;
	private Date datePeremption;
	@ManyToOne
	@JoinColumn(name="CODE_MEDICAMENT")
	private Medicament medicament;
	public Exemplaire() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Exemplaire(Date dateFabrication, Date datePeremption) {
		super();
		this.dateFabrication = dateFabrication;
		this.datePeremption = datePeremption;
	}
	public Long getCodeExemplaire() {
		return codeExemplaire;
	}
	public void setCodeExemplaire(Long codeExemplaire) {
		this.codeExemplaire = codeExemplaire;
	}
	public Date getDateFabrication() {
		return dateFabrication;
	}
	public void setDateFabrication(Date dateFabrication) {
		this.dateFabrication = dateFabrication;
	}
	public Date getDatePeremption() {
		return datePeremption;
	}
	public void setDatePeremption(Date datePeremption) {
		this.datePeremption = datePeremption;
	}
	public Medicament getMedicament() {
		return medicament;
	}
	public void setMedicament(Medicament medicament) {
		this.medicament = medicament;
	}
	

}
