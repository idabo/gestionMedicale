package com.gestion.medicale.metier;

import java.util.List;

import com.gestion.medicale.entities.Medicament;

public interface MedicamentMetier {
	public Medicament addMedicament(Medicament me);
	public Medicament getMedicament(Long code);
	public Medicament modifyMedicament(Long code, Medicament me);
	public boolean deleteMedicament(Long code);
	public List<Medicament> listMedicament();
	public List<Medicament> medicamentParMC(String mc);

}
