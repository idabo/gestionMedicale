package com.gestion.medicale.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Maladie implements Serializable{
	@Id
	@GeneratedValue
	private Long codeMaladie;
	private String llibelleMaladie;
	@OneToMany(mappedBy="maladie")
	private List<ConsMaladie> consMaladies;
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
	@JsonIgnore
	public List<ConsMaladie> getConsMaladies() {
		return consMaladies;
	}
	public void setConsMaladies(List<ConsMaladie> consMaladies) {
		this.consMaladies = consMaladies;
	}

	

}
