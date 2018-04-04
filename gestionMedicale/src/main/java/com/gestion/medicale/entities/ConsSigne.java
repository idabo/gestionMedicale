package com.gestion.medicale.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ConsSigne implements Serializable{
	@Id
	@GeneratedValue
	private Long codeConsSigne;
	@ManyToOne
	@JoinColumn(name="CODE_CONSULTATION")
	private Consultation consultation;
	@ManyToOne
	@JoinColumn(name="CODE_SIGNE")
	private Signe signe;
	public ConsSigne() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ConsSigne(Long codeConsSigne, Consultation consultation, Signe signe) {
		super();
		this.codeConsSigne = codeConsSigne;
		this.consultation = consultation;
		this.signe = signe;
	}
	public Long getCodeConsSigne() {
		return codeConsSigne;
	}
	public void setCodeConsSigne(Long codeConsSigne) {
		this.codeConsSigne = codeConsSigne;
	}
	public Consultation getConsultation() {
		return consultation;
	}
	public void setConsultation(Consultation consultation) {
		this.consultation = consultation;
	}
	public Signe getSigne() {
		return signe;
	}
	public void setSigne(Signe signe) {
		this.signe = signe;
	}
	

}
