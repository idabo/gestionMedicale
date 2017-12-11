package com.gestion.medicale.metier;

import java.util.List;

import com.gestion.medicale.entities.ConsMedicament;

public interface ConsMedicamentMetier {
	public ConsMedicament addConsMedicament(ConsMedicament cm);
	public ConsMedicament getConsMedicament(Long code);
	public ConsMedicament modifyConsMedicament(Long code, ConsMedicament cm);
	public boolean deleteConsMedicament(Long code);
	public List<ConsMedicament> listConsMedicament();
	public List<ConsMedicament> consMedicamentParMC(String mc);


}
