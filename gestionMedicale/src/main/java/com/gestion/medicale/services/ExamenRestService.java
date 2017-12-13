package com.gestion.medicale.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.medicale.entities.Examen;
import com.gestion.medicale.metier.ExamenMetier;

@RestController
@CrossOrigin("*")
public class ExamenRestService {

	@Autowired
	private ExamenMetier examenMetier;
    @RequestMapping(value="/examens",method=RequestMethod.POST)
	public Examen addExamen(@RequestBody Examen ex) {
		return examenMetier.addExamen(ex);
	}
    @RequestMapping(value="/examens/{code}",method=RequestMethod.GET)
	public Examen getExamen(@PathVariable Long code) {
		return examenMetier.getExamen(code);
	}
    @RequestMapping(value="/examens/{code}",method=RequestMethod.PUT)
	public Examen modifyExamen(@PathVariable Long code, @RequestBody Examen ex) {
		return examenMetier.modifyExamen(code, ex);
	}
    @RequestMapping(value="/examens/{code}",method=RequestMethod.DELETE)
	public boolean deleteExamen(@PathVariable Long code) {
		return examenMetier.deleteExamen(code);
	}
    @RequestMapping(value="/examens",method=RequestMethod.GET)
	public List<Examen> listExamen() {
		return examenMetier.listExamen();
	}

	public List<Examen> examenParMC(String mc) {
		return examenMetier.examenParMC(mc);
	}
	
}
