package com.gestion.medicale.metier;

import java.util.List;

import com.gestion.medicale.entities.ConsSigne;

public interface ConsSigneMetier {
	public ConsSigne addConsSigne(ConsSigne cs);
	public ConsSigne getConsSigne(Long code);
	public ConsSigne modifyConsSigne(Long code, ConsSigne cs);
	public boolean deleteConsSigne(Long code);
	public List<ConsSigne> listConsSigne();
	public List<ConsSigne> consSigneParMC(String mc);

}
