package com.gestion.medicale.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ConsExamen implements Serializable{
	@Id
	@GeneratedValue
	private Long codeConsExamen;
	private String resultat;
	private String commentaireConsExamen;
	@ManyToOne
	@JoinColumn(name="CODE_CONSULTATION")
	private Consultation consultation;
	@ManyToOne
	@JoinColumn(name="CODE_EXAMEN")
	private Examen examen;
	public ConsExamen() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ConsExamen(String resultat, String commentaireConsExamen) {
		super();
		this.resultat = resultat;
		this.commentaireConsExamen = commentaireConsExamen;
	}
	public Long getCodeConsExamen() {
		return codeConsExamen;
	}
	public void setCodeConsExamen(Long codeConsExamen) {
		this.codeConsExamen = codeConsExamen;
	}
	public String getResultat() {
		return resultat;
	}
	public void setResultat(String resultat) {
		this.resultat = resultat;
	}
	public String getCommentaireConsExamen() {
		return commentaireConsExamen;
	}
	public void setCommentaireConsExamen(String commentaireConsExamen) {
		this.commentaireConsExamen = commentaireConsExamen;
	}
	public Consultation getConsultation() {
		return consultation;
	}
	public void setConsultation(Consultation consultation) {
		this.consultation = consultation;
	}
	public Examen getExamen() {
		return examen;
	}
	public void setExamen(Examen examen) {
		this.examen = examen;
	}
	

}
