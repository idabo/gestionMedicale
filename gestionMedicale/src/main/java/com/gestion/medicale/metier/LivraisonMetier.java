package com.gestion.medicale.metier;

import java.util.List;

import com.gestion.medicale.entities.Examen;
import com.gestion.medicale.entities.Livraison;

public interface LivraisonMetier {
	public Livraison addLivraison(Livraison li);
	public Livraison getLivraison(Long code);
	public Livraison modifyLivraison(Long code, Livraison li);
	public boolean deleteLivraison(Long code);
	public List<Livraison> listLivraison();
	public List<Livraison> livraisonParMC(String mc);

}
