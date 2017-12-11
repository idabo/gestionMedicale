package com.gestion.medicale.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Maladie implements Serializable{
	@Id
	@GeneratedValue
	private Long codeMaladie;
	private String llibelleMaladie;
	@ManyToMany(mappedBy = "maladies")
	private Collection<Consultation> consultations;
	public Maladie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Maladie(String llibelleMaladie) {
		super();
		this.llibelleMaladie = llibelleMaladie;
	}
	public Long getCodeMaladie() {
		return codeMaladie;
	}
	public void setCodeMaladie(Long codeMaladie) {
		this.codeMaladie = codeMaladie;
	}
	public String getLlibelleMaladie() {
		return llibelleMaladie;
	}
	public void setLlibelleMaladie(String llibelleMaladie) {
		this.llibelleMaladie = llibelleMaladie;
	}
	public Collection<Consultation> getConsultations() {
		return consultations;
	}
	public void setConsultations(Collection<Consultation> consultations) {
		this.consultations = consultations;
	}
	

}
