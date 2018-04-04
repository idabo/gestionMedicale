package com.gestion.medicale.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ConsMaladie implements Serializable{
	@Id
	@GeneratedValue
	private Long codeConsMaladie;
	@ManyToOne
	@JoinColumn(name="CODE_CONSULTATION")
	private Consultation consultation;
	@ManyToOne
	@JoinColumn(name="CODE_MALADIE")
	private Maladie maladie;
	public ConsMaladie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ConsMaladie(Long codeConsMaladie, Consultation consultation, Maladie maladie) {
		super();
		this.codeConsMaladie = codeConsMaladie;
		this.consultation = consultation;
		this.maladie = maladie;
	}
	public Long getCodeConsMaladie() {
		return codeConsMaladie;
	}
	public void setCodeConsMaladie(Long codeConsMaladie) {
		this.codeConsMaladie = codeConsMaladie;
	}
	public Consultation getConsultation() {
		return consultation;
	}
	public void setConsultation(Consultation consultation) {
		this.consultation = consultation;
	}
	public Maladie getMaladie() {
		return maladie;
	}
	public void setMaladie(Maladie maladie) {
		this.maladie = maladie;
	}
	

}
