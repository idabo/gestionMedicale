package com.gestion.medicale.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.medicale.dao.ConsExamenRepository;
import com.gestion.medicale.entities.ConsExamen;

@Service
public class ConsExamenMetierImpl implements ConsExamenMetier{

	@Autowired
	private ConsExamenRepository consExamenRepository;
	
	@Override
	public ConsExamen addConsExamen(ConsExamen ce) {
		// TODO Auto-generated method stub
		return consExamenRepository.save(ce);
	}

	@Override
	public ConsExamen getConsExamen(Long code) {
		// TODO Auto-generated method stub
		return consExamenRepository.findOne(code);
	}

	@Override
	public ConsExamen modifyConsExamen(Long code, ConsExamen ce) {
		// TODO Auto-generated method stub
		ce.setCodeConsExamen(code);
		return consExamenRepository.save(ce);
	}

	@Override
	public boolean deleteConsExamen(Long code) {
		// TODO Auto-generated method stub
		consExamenRepository.delete(code);
		return true;
	}

	@Override
	public List<ConsExamen> listConsExamen() {
		// TODO Auto-generated method stub
		return consExamenRepository.findAll();
	}

	@Override
	public List<ConsExamen> consExamenParMC(String mc) {
		// TODO Auto-generated method stub
		return null;
	}

}
