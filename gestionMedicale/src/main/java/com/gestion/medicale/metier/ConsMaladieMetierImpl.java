package com.gestion.medicale.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.medicale.dao.ConsMaladieRepository;
import com.gestion.medicale.entities.ConsMaladie;

@Service
public class ConsMaladieMetierImpl implements ConsMaladieMetier{
	
	@Autowired
	private ConsMaladieRepository consMaladieRepository;

	@Override
	public ConsMaladie addConsMaladie(ConsMaladie cm) {
		// TODO Auto-generated method stub
		return consMaladieRepository.save(cm);
	}

	@Override
	public ConsMaladie getConsMaladie(Long code) {
		// TODO Auto-generated method stub
		return consMaladieRepository.findOne(code);
	}

	@Override
	public ConsMaladie modifyConsMaladie(Long code, ConsMaladie cm) {
		// TODO Auto-generated method stub
		cm.setCodeConsMaladie(code);
		return consMaladieRepository.save(cm);
	}

	@Override
	public boolean deleteConsMaladie(Long code) {
		// TODO Auto-generated method stub
		consMaladieRepository.delete(code);
		return true;
	}

	@Override
	public List<ConsMaladie> listConsMaladie() {
		// TODO Auto-generated method stub
		return consMaladieRepository.findAll();
	}

	@Override
	public List<ConsMaladie> consMaladieParMC(String mc) {
		// TODO Auto-generated method stub
		return null;
	}

}
