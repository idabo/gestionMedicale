package com.gestion.medicale.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ConsMedicament implements Serializable{
	@Id
	@GeneratedValue
	private Long codeConsMedicament;
	private Date dureeTraitementDeb;
	private Date dureeTraitementFin;
	private String posologie;
	@ManyToOne
	@JoinColumn(name="CODE_CONSULTATION")
	private Consultation consultation;
	@ManyToOne
	@JoinColumn(name="CODE_MEDICAMENT")
	private Medicament medicament;
	public ConsMedicament() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ConsMedicament(Date dureeTraitementDeb, Date dureeTraitementFin, String posologie) {
		super();
		this.dureeTraitementDeb = dureeTraitementDeb;
		this.dureeTraitementFin = dureeTraitementFin;
		this.posologie = posologie;
	}
	public Long getCodeConsMedicament() {
		return codeConsMedicament;
	}
	public void setCodeConsMedicament(Long codeConsMedicament) {
		this.codeConsMedicament = codeConsMedicament;
	}
	public Date getDureeTraitementDeb() {
		return dureeTraitementDeb;
	}
	public void setDureeTraitementDeb(Date dureeTraitementDeb) {
		this.dureeTraitementDeb = dureeTraitementDeb;
	}
	public Date getDureeTraitementFin() {
		return dureeTraitementFin;
	}
	public void setDureeTraitementFin(Date dureeTraitementFin) {
		this.dureeTraitementFin = dureeTraitementFin;
	}
	public String getPosologie() {
		return posologie;
	}
	public void setPosologie(String posologie) {
		this.posologie = posologie;
	}
	public Consultation getConsultation() {
		return consultation;
	}
	public void setConsultation(Consultation consultation) {
		this.consultation = consultation;
	}
	public Medicament getMedicament() {
		return medicament;
	}
	public void setMedicament(Medicament medicament) {
		this.medicament = medicament;
	}
	

}
