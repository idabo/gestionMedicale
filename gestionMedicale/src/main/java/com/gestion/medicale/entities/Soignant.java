package com.gestion.medicale.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@DiscriminatorValue("SO")
public class Soignant extends Utilisateur{

	private String statut;
	@OneToMany(mappedBy="utilisateurSoignant")
	private List<Consultation> consultations;
	@OneToMany(mappedBy="utilisateurSoignant")
	private List<Occupation> occupations;
	@ManyToOne
	@JoinColumn(name="code_soignant_rempl")
	private Soignant soignantRempl;
	@OneToMany(mappedBy="utilisateurSoignant")
	private List<Remplacement> remplacements;
	@OneToMany(mappedBy="utilisateurSoignant")
	private List<Absence> absences;
	@OneToMany(mappedBy="utilisateurSoignant")
	private List<Presence> presences;
	@OneToMany(mappedBy="utilisateurSoignant")
	private List<RendezVous> lesRendezVous;
	public Soignant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Soignant(String nomUtilisateur, String prenomUtilisateur, String telUtilisateur, String adresseUtilisateur,
			Date dateNaissUtilisateur, String emailUtilisateur, String professionUtilisateur) {
		super(nomUtilisateur, prenomUtilisateur, telUtilisateur, adresseUtilisateur, dateNaissUtilisateur, emailUtilisateur,
				professionUtilisateur);
		// TODO Auto-generated constructor stub
		this.statut = statut;
		this.consultations = consultations;
	}
	public Soignant(String nomUtilisateur, String prenomUtilisateur) {
		super(nomUtilisateur, prenomUtilisateur);
		// TODO Auto-generated constructor stub
		this.statut = statut;
		this.consultations = consultations;
	}
	public String getStatut() {
		return statut;
	}
	public void setStatut(String statut) {
		this.statut = statut;
	}
	@JsonIgnore
	public List<Consultation> getConsultations() {
		return consultations;
	}
	public void setConsultations(List<Consultation> consultations) {
		this.consultations = consultations;
	}
	@JsonIgnore
	public List<Occupation> getOccupations() {
		return occupations;
	}
	public void setOccupations(List<Occupation> occupations) {
		this.occupations = occupations;
	}
	public Soignant getSoignantRempl() {
		return soignantRempl;
	}
	public void setSoignantRempl(Soignant soignantRempl) {
		this.soignantRempl = soignantRempl;
	}
	@JsonIgnore
	public List<Remplacement> getRemplacements() {
		return remplacements;
	}
	public void setRemplacements(List<Remplacement> remplacements) {
		this.remplacements = remplacements;
	}
	public List<Absence> getAbsences() {
		return absences;
	}
	public void setAbsences(List<Absence> absences) {
		this.absences = absences;
	}
	@JsonIgnore
	public List<Presence> getPresences() {
		return presences;
	}
	public void setPresences(List<Presence> presences) {
		this.presences = presences;
	}
	@JsonIgnore
	public List<RendezVous> getLesRendezVous() {
		return lesRendezVous;
	}
	public void setLesRendezVous(List<RendezVous> lesRendezVous) {
		this.lesRendezVous = lesRendezVous;
	}
	
	
}
