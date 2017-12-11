package com.gestion.medicale.metier;

import java.util.List;

import com.gestion.medicale.entities.Signe;

public interface SigneMetier {
	public Signe addSigne(Signe si);
	public Signe getSigne(Long code);
	public Signe modifySigne(Long code, Signe si);
	public boolean deleteSigne(Long code);
	public List<Signe> listSigne();
	public List<Signe> signeParMC(String mc);

}
