package com.gestion.medicale.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.medicale.entities.ConsSigne;
import com.gestion.medicale.metier.ConsSigneMetier;

@RestController
@CrossOrigin("*")
public class ConsSigneRestService {

	@Autowired
	private ConsSigneMetier consSigneMetier;
	
    @RequestMapping(value="/consSignes",method=RequestMethod.POST)
	public ConsSigne addConsSigne(@RequestBody ConsSigne cs) {
		return consSigneMetier.addConsSigne(cs);
	}
    @RequestMapping(value="/consSignes/{code}",method=RequestMethod.GET)
	public ConsSigne getConsSigne(@PathVariable Long code) {
		return consSigneMetier.getConsSigne(code);
	}
    @RequestMapping(value="/consSignes/{code}",method=RequestMethod.PUT)
	public ConsSigne modifyConsSigne(@PathVariable Long code, @RequestBody ConsSigne cs) {
		return consSigneMetier.modifyConsSigne(code, cs);
	}
    @RequestMapping(value="/consSignes/{code}",method=RequestMethod.DELETE)
	public boolean deleteConsSigne(@PathVariable Long code) {
		return consSigneMetier.deleteConsSigne(code);
	}
    @RequestMapping(value="/consSignes",method=RequestMethod.GET)
	public List<ConsSigne> listConsSigne() {
		return consSigneMetier.listConsSigne();
	}

	public List<ConsSigne> consSigneParMC(String mc) {
		return consSigneMetier.consSigneParMC(mc);
	}


}
