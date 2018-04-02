package com.gestion.medicale.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Calendrier implements Serializable{
	@Id
	@GeneratedValue
	private Long codeCalendrier;
	private Date dateDebCalendrier;
	private Date dateFinCalendrier;
	@OneToMany(mappedBy="calendrier")
	private List<Occupation> occupations;
	@OneToMany(mappedBy="calendrier")
	private List<Remplacement> remplacements;
	@OneToMany(mappedBy="calendrier")
	private List<RendezVous> rendezvous;
	@OneToMany(mappedBy="calendrier")
	private List<Absence> absences;
	public Calendrier() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Calendrier(Date dateDebCalendrier, Date dateFinCalendrier) {
		super();
		this.dateDebCalendrier = dateDebCalendrier;
		this.dateFinCalendrier = dateFinCalendrier;
	}
	public Long getCodeCalendrier() {
		return codeCalendrier;
	}
	public void setCodeCalendrier(Long codeCalendrier) {
		this.codeCalendrier = codeCalendrier;
	}
	public Date getDateDebCalendrier() {
		return dateDebCalendrier;
	}
	public void setDateDebCalendrier(Date dateDebCalendrier) {
		this.dateDebCalendrier = dateDebCalendrier;
	}
	public Date getDateFinCalendrier() {
		return dateFinCalendrier;
	}
	public void setDateFinCalendrier(Date dateFinCalendrier) {
		this.dateFinCalendrier = dateFinCalendrier;
	}
	public List<Occupation> getOccupations() {
		return occupations;
	}
	public void setOccupations(List<Occupation> occupations) {
		this.occupations = occupations;
	}
	public List<Remplacement> getRemplacements() {
		return remplacements;
	}
	public void setRemplacements(List<Remplacement> remplacements) {
		this.remplacements = remplacements;
	}
	public List<RendezVous> getRendezvous() {
		return rendezvous;
	}
	public void setRendezvous(List<RendezVous> rendezvous) {
		this.rendezvous = rendezvous;
	}
	public List<Absence> getAbsences() {
		return absences;
	}
	public void setAbsences(List<Absence> absences) {
		this.absences = absences;
	}
	
	

}
