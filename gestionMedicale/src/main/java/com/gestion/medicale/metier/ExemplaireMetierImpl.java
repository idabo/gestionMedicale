package com.gestion.medicale.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.medicale.dao.ExemplaireRepository;
import com.gestion.medicale.entities.Exemplaire;

@Service
public class ExemplaireMetierImpl implements ExemplaireMetier{
	
	@Autowired
	private ExemplaireRepository exemplaireRepository;


	@Override
	public Exemplaire addExemplaire(Exemplaire ex) {
		// TODO Auto-generated method stub
		return exemplaireRepository.save(ex);
	}

	@Override
	public Exemplaire getExemplaire(Long code) {
		// TODO Auto-generated method stub
		return exemplaireRepository.findOne(code);
	}

	@Override
	public Exemplaire modifyExemplaire(Long code, Exemplaire ex) {
		// TODO Auto-generated method stub
		ex.setCodeExemplaire(code);
		return exemplaireRepository.save(ex);
	}

	@Override
	public boolean deleteExemplaire(Long code) {
		// TODO Auto-generated method stub
		exemplaireRepository.delete(code);
		return true;
	}

	@Override
	public List<Exemplaire> listExemplaire() {
		// TODO Auto-generated method stub
		return exemplaireRepository.findAll();
	}

	@Override
	public List<Exemplaire> exemplaireParMC(String mc) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
