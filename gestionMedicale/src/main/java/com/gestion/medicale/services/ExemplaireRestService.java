package com.gestion.medicale.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.medicale.entities.Exemplaire;
import com.gestion.medicale.metier.ExemplaireMetier;

@RestController
@CrossOrigin("*")
public class ExemplaireRestService {
	
	@Autowired
	private ExemplaireMetier exemplaireMetier;
    @RequestMapping(value="/exemplaires",method=RequestMethod.POST)
	public Exemplaire addExemplaire(@RequestBody Exemplaire ex) {
		return exemplaireMetier.addExemplaire(ex);
	}
    @RequestMapping(value="/exemplaires/{code}",method=RequestMethod.GET)
	public Exemplaire getExemplaire(@PathVariable Long code) {
		return exemplaireMetier.getExemplaire(code);
	}
    @RequestMapping(value="/exemplaires/{code}",method=RequestMethod.PUT)
	public Exemplaire modifyExemplaire(@PathVariable Long code,@RequestBody Exemplaire ex) {
		return exemplaireMetier.modifyExemplaire(code, ex);
	}
    @RequestMapping(value="/exemplaires/{code}",method=RequestMethod.DELETE)
	public boolean deleteExemplaire(@PathVariable Long code) {
		return exemplaireMetier.deleteExemplaire(code);
	}
    @RequestMapping(value="/exemplaires",method=RequestMethod.GET)
	public List<Exemplaire> listExemplaire() {
		return exemplaireMetier.listExemplaire();
	}

	public List<Exemplaire> exemplaireParMC(String mc) {
		return exemplaireMetier.exemplaireParMC(mc);
	}
	

}
