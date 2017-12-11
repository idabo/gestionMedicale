package com.gestion.medicale.metier;

import java.util.List;

import com.gestion.medicale.entities.Maladie;

public interface MaladieMetier {
	public Maladie addMaladie(Maladie ma);
	public Maladie getMaladie(Long code);
	public Maladie modifyMaladie(Long code, Maladie ma);
	public boolean deleteMaladie(Long code);
	public List<Maladie> listMaladie();
	public List<Maladie> maladieParMC(String mc);

}
