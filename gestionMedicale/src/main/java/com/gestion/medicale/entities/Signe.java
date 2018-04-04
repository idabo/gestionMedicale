package com.gestion.medicale.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Signe implements Serializable{
	@Id
	@GeneratedValue
	private Long codeSigne;
	private String libelleSigne;
	@OneToMany(mappedBy="signe")
	private List<ConsSigne> consSignes;
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
	public List<ConsSigne> getConsSignes() {
		return consSignes;
	}
	public void setConsSignes(List<ConsSigne> consSignes) {
		this.consSignes = consSignes;
	}

	

}
