package com.gestion.medicale.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.medicale.dao.ConsMedicamentRepository;
import com.gestion.medicale.entities.ConsMedicament;

@Service
public class ConsMedicamentMetierImpl implements ConsMedicamentMetier{

	@Autowired
	private ConsMedicamentRepository consMedicamentRepository;
	
	@Override
	public ConsMedicament addConsMedicament(ConsMedicament cm) {
		// TODO Auto-generated method stub
		return consMedicamentRepository.save(cm);
	}

	@Override
	public ConsMedicament getConsMedicament(Long code) {
		// TODO Auto-generated method stub
		return consMedicamentRepository.findOne(code);
	}

	@Override
	public ConsMedicament modifyConsMedicament(Long code, ConsMedicament cm) {
		// TODO Auto-generated method stub
		cm.setCodeConsMedicament(code);
		return consMedicamentRepository.save(cm);
	}

	@Override
	public boolean deleteConsMedicament(Long code) {
		// TODO Auto-generated method stub
		consMedicamentRepository.delete(code);
		return true;
	}

	@Override
	public List<ConsMedicament> listConsMedicament() {
		// TODO Auto-generated method stub
		return consMedicamentRepository.findAll();
	}

	@Override
	public List<ConsMedicament> consMedicamentParMC(String mc) {
		// TODO Auto-generated method stub
		return null;
	}

}
