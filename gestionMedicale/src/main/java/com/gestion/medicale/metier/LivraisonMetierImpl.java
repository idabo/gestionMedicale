package com.gestion.medicale.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.medicale.dao.LivraisonRepository;
import com.gestion.medicale.entities.Livraison;

@Service
public class LivraisonMetierImpl implements LivraisonMetier{
	
	@Autowired
	private LivraisonRepository livraisonRepository;

	@Override
	public Livraison addLivraison(Livraison li) {
		// TODO Auto-generated method stub
		return livraisonRepository.save(li);
	}

	@Override
	public Livraison getLivraison(Long code) {
		// TODO Auto-generated method stub
		return livraisonRepository.findOne(code);
	}

	@Override
	public Livraison modifyLivraison(Long code, Livraison li) {
		// TODO Auto-generated method stub
		li.setCodeLivraison(code);
		return livraisonRepository.save(li);
	}

	@Override
	public boolean deleteLivraison(Long code) {
		// TODO Auto-generated method stub
		livraisonRepository.delete(code);
		return true;
	}

	@Override
	public List<Livraison> listLivraison() {
		// TODO Auto-generated method stub
		return livraisonRepository.findAll();
	}

	@Override
	public List<Livraison> livraisonParMC(String mc) {
		// TODO Auto-generated method stub
		return null;
	}

}
