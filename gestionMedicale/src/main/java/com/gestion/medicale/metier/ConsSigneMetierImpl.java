package com.gestion.medicale.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.medicale.dao.ConsSigneRepository;
import com.gestion.medicale.entities.ConsSigne;

@Service
public class ConsSigneMetierImpl implements ConsSigneMetier {
	
	@Autowired
	private ConsSigneRepository consSigneRepository;

	@Override
	public ConsSigne addConsSigne(ConsSigne cs) {
		// TODO Auto-generated method stub
		return consSigneRepository.save(cs);
	}

	@Override
	public ConsSigne getConsSigne(Long code) {
		// TODO Auto-generated method stub
		return consSigneRepository.findOne(code);
	}

	@Override
	public ConsSigne modifyConsSigne(Long code, ConsSigne cs) {
		// TODO Auto-generated method stub
		cs.setCodeConsSigne(code);
		return consSigneRepository.save(cs);
	}

	@Override
	public boolean deleteConsSigne(Long code) {
		// TODO Auto-generated method stub
		consSigneRepository.delete(code);
		return true;
	}

	@Override
	public List<ConsSigne> listConsSigne() {
		// TODO Auto-generated method stub
		return consSigneRepository.findAll();
	}

	@Override
	public List<ConsSigne> consSigneParMC(String mc) {
		// TODO Auto-generated method stub
		return null;
	}

}
