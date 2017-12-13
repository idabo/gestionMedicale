package com.gestion.medicale.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.medicale.entities.Medicament;
import com.gestion.medicale.metier.MedicamentMetier;

@RestController
@CrossOrigin("*")
public class MedicamentRestService {
	@Autowired
	private MedicamentMetier medicamentMetier;
    @RequestMapping(value="/medicaments",method=RequestMethod.POST)
	public Medicament addMedicament(@RequestBody Medicament me) {
		return medicamentMetier.addMedicament(me);
	}
    @RequestMapping(value="/medicaments/{code}",method=RequestMethod.GET)
	public Medicament getMedicament(@PathVariable Long code) {
		return medicamentMetier.getMedicament(code);
	}
    @RequestMapping(value="/medicaments/{code}",method=RequestMethod.PUT)
	public Medicament modifyMedicament(@PathVariable Long code, @RequestBody Medicament me) {
		return medicamentMetier.modifyMedicament(code, me);
	}
    @RequestMapping(value="/medicaments/{code}",method=RequestMethod.DELETE)
	public boolean deleteMedicament(@PathVariable Long code) {
		return medicamentMetier.deleteMedicament(code);
	}
    @RequestMapping(value="/medicaments",method=RequestMethod.GET)
	public List<Medicament> listMedicament() {
		return medicamentMetier.listMedicament();
	}

	public List<Medicament> medicamentParMC(String mc) {
		return medicamentMetier.medicamentParMC(mc);
	}
	

}
