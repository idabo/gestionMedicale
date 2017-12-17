package com.gestion.medicale.metier;

import java.util.List;

import com.gestion.medicale.entities.LivMedicament;

public interface LivMedicamentMetier {
	public LivMedicament addLivMedicament(LivMedicament lm);
	public LivMedicament getLivMedicament(Long code);
	public LivMedicament modifyLivMedicament(Long code, LivMedicament lm);
	public boolean deleteLivMedicament(Long code);
	public List<LivMedicament> listLivMedicament();
	public List<LivMedicament> livMedicamentParMC(String mc);

}
