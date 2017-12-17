package com.gestion.medicale.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.medicale.entities.RendezVous;
import com.gestion.medicale.metier.RendezVousMetier;

@RestController
@CrossOrigin("*")
public class RendezVousRestService {
	@Autowired
	private RendezVousMetier rendezVousMetier;
	
    @RequestMapping(value="/rendezVous",method=RequestMethod.POST)
	public RendezVous addRendezVous(@RequestBody RendezVous rv) {
		return rendezVousMetier.addRendezVous(rv);
	}
    @RequestMapping(value="/rendezVous/{code}",method=RequestMethod.GET)
	public RendezVous getRendezVous(@PathVariable Long code) {
		return rendezVousMetier.getRendezVous(code);
	}
    @RequestMapping(value="/rendezVous/{code}",method=RequestMethod.PUT)
	public RendezVous modifyRendezVous(@PathVariable Long code, @RequestBody RendezVous rv) {
		return rendezVousMetier.modifyRendezVous(code, rv);
	}
    @RequestMapping(value="/rendezVous/{code}",method=RequestMethod.DELETE)
	public boolean deleteRendezVous(@PathVariable Long code) {
		return rendezVousMetier.deleteRendezVous(code);
	}
    @RequestMapping(value="/rendezVous",method=RequestMethod.GET)
	public List<RendezVous> listRendezVous() {
		return rendezVousMetier.listRendezVous();
	}

	public List<RendezVous> rendezVousParMC(String mc) {
		return rendezVousMetier.rendezVousParMC(mc);
	}
	

}
