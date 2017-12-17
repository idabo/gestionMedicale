package com.gestion.medicale.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.medicale.entities.Livraison;
import com.gestion.medicale.metier.LivraisonMetier;

@RestController
@CrossOrigin("*")
public class LivraisonRestService {
	
	@Autowired
	private LivraisonMetier livraisonMetier;
    @RequestMapping(value="/livraisons",method=RequestMethod.POST)
	public Livraison addLivraison(@RequestBody Livraison li) {
		return livraisonMetier.addLivraison(li);
	}
    @RequestMapping(value="/livraisons/{code}",method=RequestMethod.GET)
	public Livraison getLivraison(@PathVariable Long code) {
		return livraisonMetier.getLivraison(code);
	}
    @RequestMapping(value="/livraisons/{code}",method=RequestMethod.PUT)
	public Livraison modifyLivraison(@PathVariable Long code,@RequestBody Livraison li) {
		return livraisonMetier.modifyLivraison(code, li);
	}
    @RequestMapping(value="/livraisons/{code}",method=RequestMethod.DELETE)
	public boolean deleteLivraison(@PathVariable Long code) {
		return livraisonMetier.deleteLivraison(code);
	}
    @RequestMapping(value="/livraisons",method=RequestMethod.GET)
	public List<Livraison> listLivraison() {
		return livraisonMetier.listLivraison();
	}

	public List<Livraison> livraisonParMC(String mc) {
		return livraisonMetier.livraisonParMC(mc);
	}
	

}
