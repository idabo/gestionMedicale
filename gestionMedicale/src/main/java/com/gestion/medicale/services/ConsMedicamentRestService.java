package com.gestion.medicale.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.medicale.entities.ConsMedicament;
import com.gestion.medicale.metier.ConsMedicamentMetier;

@RestController
@CrossOrigin("*")
public class ConsMedicamentRestService {
	@Autowired
	private ConsMedicamentMetier consMedicamentMetier;
    @RequestMapping(value="/consMedicaments",method=RequestMethod.POST)
	public ConsMedicament addConsMedicament(@RequestBody ConsMedicament cm) {
		return consMedicamentMetier.addConsMedicament(cm);
	}
    @RequestMapping(value="/consMedicaments/{code}",method=RequestMethod.GET)
	public ConsMedicament getConsMedicament(@PathVariable Long code) {
		return consMedicamentMetier.getConsMedicament(code);
	}
    @RequestMapping(value="/consMedicaments/{code}",method=RequestMethod.PUT)
	public ConsMedicament modifyConsMedicament(@PathVariable Long code, @RequestBody ConsMedicament cm) {
		return consMedicamentMetier.modifyConsMedicament(code, cm);
	}
    @RequestMapping(value="/consMedicaments/{code}",method=RequestMethod.DELETE)
	public boolean deleteConsMedicament(@PathVariable Long code) {
		return consMedicamentMetier.deleteConsMedicament(code);
	}
    @RequestMapping(value="/consMedicaments",method=RequestMethod.GET)
	public List<ConsMedicament> listConsMedicament() {
		return consMedicamentMetier.listConsMedicament();
	}

	public List<ConsMedicament> consMedicamentParMC(String mc) {
		return consMedicamentMetier.consMedicamentParMC(mc);
	}
	

}
