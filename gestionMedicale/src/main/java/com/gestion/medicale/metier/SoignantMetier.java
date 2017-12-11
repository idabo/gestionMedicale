package com.gestion.medicale.metier;

import java.util.List;

import com.gestion.medicale.entities.Soignant;

public interface SoignantMetier {
	public Soignant addSoignant(Soignant so);
	public Soignant getSoignant(Long code);
	public Soignant modifySoignant(Long code, Soignant so);
	public boolean deleteSoignant(Long code);
	public List<Soignant> listSoignant();
	public List<Soignant> soignantParMC(String mc);

}
