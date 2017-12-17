package com.gestion.medicale.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.medicale.entities.LivMedicament;
import com.gestion.medicale.metier.LivMedicamentMetier;

@RestController
@CrossOrigin("*")
public class LivMedicamentRestService {
	
	@Autowired
	private LivMedicamentMetier livMedicamentMetier;
    @RequestMapping(value="/livMedicaments",method=RequestMethod.POST)
	public LivMedicament addLivMedicament(@RequestBody LivMedicament lm) {
		return livMedicamentMetier.addLivMedicament(lm);
	}
    @RequestMapping(value="/livMedicaments/{code}",method=RequestMethod.GET)
	public LivMedicament getLivMedicament(@PathVariable Long code) {
		return livMedicamentMetier.getLivMedicament(code);
	}
    @RequestMapping(value="/livMedicaments/{code}",method=RequestMethod.PUT)
	public LivMedicament modifyLivMedicament(@PathVariable Long code,@RequestBody LivMedicament lm) {
		return livMedicamentMetier.modifyLivMedicament(code, lm);
	}
    @RequestMapping(value="/livMedicaments/{code}",method=RequestMethod.DELETE)
	public boolean deleteLivMedicament(@PathVariable Long code) {
		return livMedicamentMetier.deleteLivMedicament(code);
	}
    @RequestMapping(value="/livMedicaments",method=RequestMethod.GET)
	public List<LivMedicament> listLivMedicament() {
		return livMedicamentMetier.listLivMedicament();
	}

	public List<LivMedicament> livMedicamentParMC(String mc) {
		return livMedicamentMetier.livMedicamentParMC(mc);
	}
	

}
