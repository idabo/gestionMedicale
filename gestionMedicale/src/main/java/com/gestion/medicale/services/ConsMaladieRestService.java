package com.gestion.medicale.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.medicale.entities.ConsMaladie;
import com.gestion.medicale.metier.ConsMaladieMetier;

@RestController
@CrossOrigin("*")
public class ConsMaladieRestService {
	@Autowired
	private ConsMaladieMetier consMaladieMetier;
    @RequestMapping(value="/consMaladies",method=RequestMethod.POST)
	public ConsMaladie addConsMaladie(@RequestBody ConsMaladie cm) {
		return consMaladieMetier.addConsMaladie(cm);
	}
    @RequestMapping(value="/consMaladies/{code}",method=RequestMethod.GET)
	public ConsMaladie getConsMaladie(@PathVariable Long code) {
		return consMaladieMetier.getConsMaladie(code);
	}
    @RequestMapping(value="/consMaladies/{code}",method=RequestMethod.PUT)
	public ConsMaladie modifyConsMaladie(@PathVariable Long code, @RequestBody ConsMaladie cm) {
		return consMaladieMetier.modifyConsMaladie(code, cm);
	}
    @RequestMapping(value="/consMaladies/{code}",method=RequestMethod.DELETE)
	public boolean deleteConsMaladie(@PathVariable Long code) {
		return consMaladieMetier.deleteConsMaladie(code);
	}
    @RequestMapping(value="/consMaladies",method=RequestMethod.GET)
	public List<ConsMaladie> listConsMaladie() {
		return consMaladieMetier.listConsMaladie();
	}

	public List<ConsMaladie> consMaladieParMC(String mc) {
		return consMaladieMetier.consMaladieParMC(mc);
	}

}
