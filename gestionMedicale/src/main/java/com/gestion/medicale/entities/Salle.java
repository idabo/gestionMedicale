package com.gestion.medicale.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Salle implements Serializable{
	@Id
	@GeneratedValue
	private Long codeSalle;
	private String nomSalle;
	@OneToMany(mappedBy="salle")
	private List<Occupation> occupations;
	public Salle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Salle(String nomSalle) {
		super();
		this.nomSalle = nomSalle;
	}
	public Long getCodeSalle() {
		return codeSalle;
	}
	public void setCodeSalle(Long codeSalle) {
		this.codeSalle = codeSalle;
	}
	public String getNomSalle() {
		return nomSalle;
	}
	public void setNomSalle(String nomSalle) {
		this.nomSalle = nomSalle;
	}
	public List<Occupation> getOccupations() {
		return occupations;
	}
	public void setOccupations(List<Occupation> occupations) {
		this.occupations = occupations;
	}
	

}
