package com.gestion.medicale.entities;

import java.io.Serializable;
import java.util.Date;
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
	@Type(name="SE",value=Secretaire.class),
	@Type(name="PA",value=Patient.class),
	@Type(name="FO",value=Fournisseur.class)
})
public class Utilisateur implements Serializable{
	@Id
	@GeneratedValue
	private Long codeUtilisateur;
	private String nomUtilisateur;
	private String prenomUtilisateur;
	private String telUtilisateur;
	private String adresseUtilisateur;
	private Date dateNaissUtilisateur;
	private String emailUtilisateur;
	private String loginUtilisateur;
	private String passwordUtilisateur;
	private String professionUtilisateur;
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
			String adresseUtilisateur, Date dateNaissUtilisateur, String emailUtilisateur,
			String professionUtilisateur) {
		super();
		this.nomUtilisateur = nomUtilisateur;
		this.prenomUtilisateur = prenomUtilisateur;
		this.telUtilisateur = telUtilisateur;
		this.adresseUtilisateur = adresseUtilisateur;
		this.dateNaissUtilisateur = dateNaissUtilisateur;
		this.emailUtilisateur = emailUtilisateur;
		this.professionUtilisateur = professionUtilisateur;
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

	public String getAdresseUtilisateur() {
		return adresseUtilisateur;
	}
	public void setAdresseUtilisateur(String adresseUtilisateur) {
		this.adresseUtilisateur = adresseUtilisateur;
	}
	public Date getDateNaissUtilisateur() {
		return dateNaissUtilisateur;
	}
	public void setDateNaissUtilisateur(Date dateNaissUtilisateur) {
		this.dateNaissUtilisateur = dateNaissUtilisateur;
	}
	public String getEmailUtilisateur() {
		return emailUtilisateur;
	}
	public void setEmailUtilisateur(String emailUtilisateur) {
		this.emailUtilisateur = emailUtilisateur;
	}
	public String getProfessionUtilisateur() {
		return professionUtilisateur;
	}
	public void setProfessionUtilisateur(String professionUtilisateur) {
		this.professionUtilisateur = professionUtilisateur;
	}
	public String getLoginUtilisateur() {
		return loginUtilisateur;
	}
	public void setLoginUtilisateur(String loginUtilisateur) {
		this.loginUtilisateur = loginUtilisateur;
	}
	public String getPasswordUtilisateur() {
		return passwordUtilisateur;
	}
	public void setPasswordUtilisateur(String passwordUtilisateur) {
		this.passwordUtilisateur = passwordUtilisateur;
	}
	
	

}
