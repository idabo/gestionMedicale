package com.gestion.medicale.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;


@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE_UTILISATEUR",discriminatorType=DiscriminatorType.STRING,length=2)

@JsonTypeInfo(use=JsonTypeInfo.Id.NAME,include=JsonTypeInfo.As.PROPERTY,property="type")
@JsonSubTypes({
	@Type(name="SO",value=Soignant.class),
	@Type(name="PA",value=Patient.class)
})
public class Utilisateur implements Serializable{
	@Id
	@GeneratedValue
	private Long codeUtilisateur;
	private String nomUtilisateur;
	private String prenomUtilisateur;
	private String telUtilisateur;
	private String adresseUlisateur;
	@OneToMany(mappedBy="utilisateur")
	private List<Consultation> consultations;
	public Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Utilisateur(String nomUtilisateur, String prenomUtilisateur) {
		super();
		this.nomUtilisateur = nomUtilisateur;
		this.prenomUtilisateur = prenomUtilisateur;
	}
	public Utilisateur(String nomUtilisateur, String prenomUtilisateur, String telUtilisateur,
			String adresseUlisateur) {
		super();
		this.nomUtilisateur = nomUtilisateur;
		this.prenomUtilisateur = prenomUtilisateur;
		this.telUtilisateur = telUtilisateur;
		this.adresseUlisateur = adresseUlisateur;
	}
	public Long getCodeUtilisateur() {
		return codeUtilisateur;
	}
	public void setCodeUtilisateur(Long codeUtilisateur) {
		this.codeUtilisateur = codeUtilisateur;
	}
	public String getNomUtilisateur() {
		return nomUtilisateur;
	}
	public void setNomUtilisateur(String nomUtilisateur) {
		this.nomUtilisateur = nomUtilisateur;
	}
	public String getPrenomUtilisateur() {
		return prenomUtilisateur;
	}
	public void setPrenomUtilisateur(String prenomUtilisateur) {
		this.prenomUtilisateur = prenomUtilisateur;
	}
	public String getTelUtilisateur() {
		return telUtilisateur;
	}
	public void setTelUtilisateur(String telUtilisateur) {
		this.telUtilisateur = telUtilisateur;
	}
	public String getAdresseUlisateur() {
		return adresseUlisateur;
	}
	public void setAdresseUlisateur(String adresseUlisateur) {
		this.adresseUlisateur = adresseUlisateur;
	}
	public List<Consultation> getConsultations() {
		return consultations;
	}
	public void setConsultations(List<Consultation> consultations) {
		this.consultations = consultations;
	}
	
	

}
