package com.gestion.medicale.metier;

import java.util.List;

import com.gestion.medicale.entities.ConsMaladie;

public interface ConsMaladieMetier {
	public ConsMaladie addConsMaladie(ConsMaladie cm);
	public ConsMaladie getConsMaladie(Long code);
	public ConsMaladie modifyConsMaladie(Long code, ConsMaladie cm);
	public boolean deleteConsMaladie(Long code);
	public List<ConsMaladie> listConsMaladie();
	public List<ConsMaladie> consMaladieParMC(String mc);

}
