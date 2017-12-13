package com.gestion.medicale.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.medicale.entities.ConsExamen;
import com.gestion.medicale.metier.ConsExamenMetier;

@RestController
@CrossOrigin("*")
public class ConsExamenRestService {
	@Autowired
	private ConsExamenMetier consExamenMetier;
    @RequestMapping(value="/consExamens",method=RequestMethod.POST)
	public ConsExamen addConsExamen(@RequestBody ConsExamen ce) {
		return consExamenMetier.addConsExamen(ce);
	}
    @RequestMapping(value="/consExamens/{code}",method=RequestMethod.GET)
	public ConsExamen getConsExamen(@PathVariable Long code) {
		return consExamenMetier.getConsExamen(code);
	}
    @RequestMapping(value="/consExamens/{code}",method=RequestMethod.PUT)
	public ConsExamen modifyConsExamen(@PathVariable Long code, @RequestBody ConsExamen ce) {
		return consExamenMetier.modifyConsExamen(code, ce);
	}
    @RequestMapping(value="/consExamens/{code}",method=RequestMethod.DELETE)
	public boolean deleteConsExamen(@PathVariable Long code) {
		return consExamenMetier.deleteConsExamen(code);
	}
    @RequestMapping(value="/consExamens",method=RequestMethod.GET)
	public List<ConsExamen> listConsExamen() {
		return consExamenMetier.listConsExamen();
	}

	public List<ConsExamen> consExamenParMC(String mc) {
		return consExamenMetier.consExamenParMC(mc);
	}
	

}

