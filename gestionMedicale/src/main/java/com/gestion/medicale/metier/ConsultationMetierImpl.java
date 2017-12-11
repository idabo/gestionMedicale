package com.gestion.medicale.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.medicale.dao.ConsultationRepository;
import com.gestion.medicale.entities.Consultation;

@Service
public class ConsultationMetierImpl implements ConsultationMetier{

	@Autowired
	private ConsultationRepository consultationRepository;
	@Override
	public Consultation addConsultation(Consultation co) {
		// TODO Auto-generated method stub
		return consultationRepository.save(co);
	}

	@Override
	public Consultation getConsultation(Long code) {
		// TODO Auto-generated method stub
		return consultationRepository.findOne(code);
	}

	@Override
	public Consultation modifyConsultation(Long code, Consultation co) {
		// TODO Auto-generated method stub
		co.setCodeCons(code);
		return consultationRepository.save(co);
	}

	@Override
	public boolean deleteConsultation(Long code) {
		// TODO Auto-generated method stub
		consultationRepository.delete(code);
		return true;
	}

	@Override
	public List<Consultation> listConsultation() {
		// TODO Auto-generated method stub
		return consultationRepository.findAll();
	}

	@Override
	public List<Consultation> consultationParMC(String mc) {
		// TODO Auto-generated method stub
		return null;
	}

}
