package com.gestion.medicale.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Signe implements Serializable{
	@Id
	@GeneratedValue
	private Long codeSigne;
	private String libelleSigne;
	@ManyToMany(mappedBy = "signes")
	private Collection<Consultation> consultations;
	public Signe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Signe(String libelleSigne) {
		super();
		this.libelleSigne = libelleSigne;
	}
	public Long getCodeSigne() {
		return codeSigne;
	}
	public void setCodeSigne(Long codeSigne) {
		this.codeSigne = codeSigne;
	}
	public String getLibelleSigne() {
		return libelleSigne;
	}
	public void setLibelleSigne(String libelleSigne) {
		this.libelleSigne = libelleSigne;
	}
	public Collection<Consultation> getConsultations() {
		return consultations;
	}
	public void setConsultations(Collection<Consultation> consultations) {
		this.consultations = consultations;
	}
	

}
