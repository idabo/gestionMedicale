package com.gestion.medicale.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Livraison implements Serializable{
	@Id
	@GeneratedValue
	private Long codeLivraison;
	private Date dateLivraison;
	@ManyToOne
	@JoinColumn(name="CODE_FOURNISSEUR")
	private Utilisateur utilisateurFournisseur;
	@OneToMany(mappedBy="livraison")
	private List<LivMedicament> livMedicament;
	public Livraison() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Livraison(Date dateLivraison) {
		super();
		this.dateLivraison = dateLivraison;
	}
	public Long getCodeLivraison() {
		return codeLivraison;
	}
	public void setCodeLivraison(Long codeLivraison) {
		this.codeLivraison = codeLivraison;
	}
	public Date getDateLivraison() {
		return dateLivraison;
	}
	public void setDateLivraison(Date dateLivraison) {
		this.dateLivraison = dateLivraison;
	}
	public Utilisateur getUtilisateurFournisseur() {
		return utilisateurFournisseur;
	}
	public void setUtilisateurFournisseur(Utilisateur utilisateurFournisseur) {
		this.utilisateurFournisseur = utilisateurFournisseur;
	}
	public List<LivMedicament> getLivMedicament() {
		return livMedicament;
	}
	public void setLivMedicament(List<LivMedicament> livMedicament) {
		this.livMedicament = livMedicament;
	}
	

}
