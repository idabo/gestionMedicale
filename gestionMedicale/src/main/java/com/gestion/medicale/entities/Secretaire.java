package com.gestion.medicale.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@DiscriminatorValue("SE")
public class Secretaire extends Utilisateur{
	@OneToMany(mappedBy="utilisateurSecretaire")
	private List<RendezVous> lesRendezVous;

	public Secretaire() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Secretaire(String nomUtilisateur, String prenomUtilisateur, String telUtilisateur, String adresseUtilisateur,
			Date dateNaissUtilisateur, String emailUtilisateur, String professionUtilisateur) {
		super(nomUtilisateur, prenomUtilisateur, telUtilisateur, adresseUtilisateur, dateNaissUtilisateur, emailUtilisateur,
				professionUtilisateur);
		// TODO Auto-generated constructor stub
		this.lesRendezVous = lesRendezVous;
	}

	public Secretaire(String nomUtilisateur, String prenomUtilisateur) {
		super(nomUtilisateur, prenomUtilisateur);
		// TODO Auto-generated constructor stub
		this.lesRendezVous = lesRendezVous;
	}
    @JsonIgnore
	public List<RendezVous> getLesRendezVous() {
		return lesRendezVous;
	}

	public void setLesRendezVous(List<RendezVous> lesRendezVous) {
		this.lesRendezVous = lesRendezVous;
	}
	

}
