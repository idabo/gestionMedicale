package com.gestion.medicale.metier;

import java.util.List;

import com.gestion.medicale.entities.RendezVous;

public interface RendezVousMetier {
	public RendezVous addRendezVous(RendezVous rv);
	public RendezVous getRendezVous(Long code);
	public RendezVous modifyRendezVous(Long code, RendezVous rv);
	public boolean deleteRendezVous(Long code);
	public List<RendezVous> listRendezVous();
	public List<RendezVous> rendezVousParMC(String mc);

}
