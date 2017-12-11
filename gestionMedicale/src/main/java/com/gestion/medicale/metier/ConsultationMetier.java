package com.gestion.medicale.metier;

import java.util.List;

import com.gestion.medicale.entities.Consultation;

public interface ConsultationMetier {
	public Consultation addConsultation(Consultation co);
	public Consultation getConsultation(Long code);
	public Consultation modifyConsultation(Long code, Consultation co);
	public boolean deleteConsultation(Long code);
	public List<Consultation> listConsultation();
	public List<Consultation> consultationParMC(String mc);

}
