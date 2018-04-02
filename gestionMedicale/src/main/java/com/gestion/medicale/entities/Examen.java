package com.gestion.medicale.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Examen implements Serializable{
	@Id
	@GeneratedValue
	private Long codeExamen;
	private String libelleExamen;
	private Date dateExamen;
	@OneToMany(mappedBy="examen")
	private List<ConsExamen> consExamens;
	public Examen() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Examen(String libelleExamen, Date dateExamen) {
		super();
		this.libelleExamen = libelleExamen;
		this.dateExamen = dateExamen;
	}
	public Long getCodeExamen() {
		return codeExamen;
	}
	public void setCodeExamen(Long codeExamen) {
		this.codeExamen = codeExamen;
	}
	public String getLibelleExamen() {
		return libelleExamen;
	}
	public void setLibelleExamen(String libelleExamen) {
		this.libelleExamen = libelleExamen;
	}
	public Date getDateExamen() {
		return dateExamen;
	}
	public void setDateExamen(Date dateExamen) {
		this.dateExamen = dateExamen;
	}
	@JsonIgnore
	public List<ConsExamen> getConsExamens() {
		return consExamens;
	}
	public void setConsExamens(List<ConsExamen> consExamens) {
		this.consExamens = consExamens;
	}
	

}
