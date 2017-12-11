package com.gestion.medicale.metier;

import java.util.List;

import com.gestion.medicale.entities.Examen;

public interface ExamenMetier {
	public Examen addExamen(Examen ex);
	public Examen getExamen(Long code);
	public Examen modifyExamen(Long code, Examen ex);
	public boolean deleteExamen(Long code);
	public List<Examen> listExamen();
	public List<Examen> examenParMC(String mc);

}
