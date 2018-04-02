package com.gestion.medicale.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Jour implements Serializable{
	@Id
	@GeneratedValue
	private Long codeJour;
	private String nomJour;
	@OneToMany(mappedBy="jour")
	private List<Presence> presences;
	public Jour() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Jour(String nomJour) {
		super();
		this.nomJour = nomJour;
	}
	public Long getCodeJour() {
		return codeJour;
	}
	public void setCodeJour(Long codeJour) {
		this.codeJour = codeJour;
	}
	public String getNomJour() {
		return nomJour;
	}
	public void setNomJour(String nomJour) {
		this.nomJour = nomJour;
	}
	public List<Presence> getPresences() {
		return presences;
	}
	public void setPresences(List<Presence> presences) {
		this.presences = presences;
	}
	

}
