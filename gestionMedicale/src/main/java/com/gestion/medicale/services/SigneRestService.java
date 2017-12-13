package com.gestion.medicale.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.medicale.entities.Signe;
import com.gestion.medicale.metier.SigneMetier;

@RestController
@CrossOrigin("*")
public class SigneRestService {
	@Autowired
	private SigneMetier signeMetier;
    @RequestMapping(value="/signes",method=RequestMethod.POST)
	public Signe addSigne(@RequestBody Signe si) {
		return signeMetier.addSigne(si);
	}
    @RequestMapping(value="/signes/{code}",method=RequestMethod.GET)
	public Signe getSigne(@PathVariable Long code) {
		return signeMetier.getSigne(code);
	}
    @RequestMapping(value="/signes/{code}",method=RequestMethod.PUT)
	public Signe modifySigne(@PathVariable Long code, @RequestBody Signe si) {
		return signeMetier.modifySigne(code, si);
	}
    @RequestMapping(value="/signes/{code}",method=RequestMethod.DELETE)
	public boolean deleteSigne(@PathVariable Long code) {
		return signeMetier.deleteSigne(code);
	}
    @RequestMapping(value="/signes",method=RequestMethod.GET)
	public List<Signe> listSigne() {
		return signeMetier.listSigne();
	}

	public List<Signe> signeParMC(String mc) {
		return signeMetier.signeParMC(mc);
	}
	

}
