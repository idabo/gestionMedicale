package com.gestion.medicale.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class LivMedicament implements Serializable{
	@Id
	@GeneratedValue
	private Long codeLivMedicament;
	private int quantite;
	@ManyToOne
	@JoinColumn(name="CODE_LIVRAISON")
	private Livraison livraison;
	@ManyToOne
	@JoinColumn(name="CODE_MEDICAMENT")
	private Medicament medicament;
	public LivMedicament() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LivMedicament(int quantite) {
		super();
		this.quantite = quantite;
	}
	public Long getCodeLivMedicament() {
		return codeLivMedicament;
	}
	public void setCodeLivMedicament(Long codeLivMedicament) {
		this.codeLivMedicament = codeLivMedicament;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public Livraison getLivraison() {
		return livraison;
	}
	public void setLivraison(Livraison livraison) {
		this.livraison = livraison;
	}
	public Medicament getMedicament() {
		return medicament;
	}
	public void setMedicament(Medicament medicament) {
		this.medicament = medicament;
	}
	

}
