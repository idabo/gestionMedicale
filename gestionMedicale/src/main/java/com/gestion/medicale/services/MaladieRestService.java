package com.gestion.medicale.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.medicale.entities.Maladie;
import com.gestion.medicale.metier.MaladieMetier;

@RestController
@CrossOrigin("*")
public class MaladieRestService {
	@Autowired
	private MaladieMetier maladieMetier;
    @RequestMapping(value="/maladies",method=RequestMethod.POST)
	public Maladie addMaladie(@RequestBody Maladie ma) {
		return maladieMetier.addMaladie(ma);
	}
    @RequestMapping(value="/maladies/{code}",method=RequestMethod.GET)
	public Maladie getMaladie(@PathVariable Long code) {
		return maladieMetier.getMaladie(code);
	}
    @RequestMapping(value="/maladies/{code}",method=RequestMethod.PUT)
	public Maladie modifyMaladie(@PathVariable Long code, @RequestBody Maladie ma) {
		return maladieMetier.modifyMaladie(code, ma);
	}
    @RequestMapping(value="/maladies/{code}",method=RequestMethod.DELETE)
	public boolean deleteMaladie(@PathVariable Long code) {
		return maladieMetier.deleteMaladie(code);
	}
    @RequestMapping(value="/maladies",method=RequestMethod.GET)
	public List<Maladie> listMaladie() {
		return maladieMetier.listMaladie();
	}

	public List<Maladie> maladieParMC(String mc) {
		return maladieMetier.maladieParMC(mc);
	}
	

}
