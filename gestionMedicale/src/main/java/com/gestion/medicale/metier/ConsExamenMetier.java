package com.gestion.medicale.metier;

import java.util.List;

import com.gestion.medicale.entities.ConsExamen;

public interface ConsExamenMetier {
	public ConsExamen addConsExamen(ConsExamen ce);
	public ConsExamen getConsExamen(Long code);
	public ConsExamen modifyConsExamen(Long code, ConsExamen ce);
	public boolean deleteConsExamen(Long code);
	public List<ConsExamen> listConsExamen();
	public List<ConsExamen> consExamenParMC(String mc);

}
