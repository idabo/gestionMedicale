package com.gestion.medicale.metier;

import java.util.List;

import com.gestion.medicale.entities.Exemplaire;

public interface ExemplaireMetier {
	public Exemplaire addExemplaire(Exemplaire ex);
	public Exemplaire getExemplaire(Long code);
	public Exemplaire modifyExemplaire(Long code, Exemplaire ex);
	public boolean deleteExemplaire(Long code);
	public List<Exemplaire> listExemplaire();
	public List<Exemplaire> exemplaireParMC(String mc);

}
