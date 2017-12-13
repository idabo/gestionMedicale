package com.gestion.medicale.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.medicale.entities.Consultation;
import com.gestion.medicale.metier.ConsultationMetier;

@RestController
@CrossOrigin("*")
public class ConsultationRestService {
	@Autowired
	private ConsultationMetier consultationMetier;
    @RequestMapping(value="/consultations",method=RequestMethod.POST)
	public Consultation addConsultation(@RequestBody Consultation co) {
		return consultationMetier.addConsultation(co);
	}
    @RequestMapping(value="/consultations/{code}",method=RequestMethod.GET)
	public Consultation getConsultation(@PathVariable Long code) {
		return consultationMetier.getConsultation(code);
	}
    @RequestMapping(value="/consultations/{code}",method=RequestMethod.PUT)
	public Consultation modifyConsultation(@PathVariable Long code, @RequestBody Consultation co) {
		return consultationMetier.modifyConsultation(code, co);
	}
    @RequestMapping(value="/consultations/{code}",method=RequestMethod.DELETE)
	public boolean deleteConsultation(@PathVariable Long code) {
		return consultationMetier.deleteConsultation(code);
	}
    @RequestMapping(value="/consultations",method=RequestMethod.GET)
	public List<Consultation> listConsultation() {
		return consultationMetier.listConsultation();
	}

	public List<Consultation> consultationParMC(String mc) {
		return consultationMetier.consultationParMC(mc);
	}
	

}
