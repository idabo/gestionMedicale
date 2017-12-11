package com.gestion.medicale.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Medicament implements Serializable{
	@Id
	@GeneratedValue
	private Long codeMedicament;
	private String libelleMedicament;
	private String groupe;
	private double prix;
	@OneToMany(mappedBy="medicament")
	private List<ConsMedicament> consMedicament;
	public Medicament() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Medicament(String libelleMedicament, String groupe, double prix) {
		super();
		this.libelleMedicament = libelleMedicament;
		this.groupe = groupe;
		this.prix = prix;
	}
	public Long getCodeMedicament() {
		return codeMedicament;
	}
	public void setCodeMedicament(Long codeMedicament) {
		this.codeMedicament = codeMedicament;
	}
	public String getLibelleMedicament() {
		return libelleMedicament;
	}
	public void setLibelleMedicament(String libelleMedicament) {
		this.libelleMedicament = libelleMedicament;
	}
	public String getGroupe() {
		return groupe;
	}
	public void setGroupe(String groupe) {
		this.groupe = groupe;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public List<ConsMedicament> getConsMedicament() {
		return consMedicament;
	}
	public void setConsMedicament(List<ConsMedicament> consMedicament) {
		this.consMedicament = consMedicament;
	}
	

}