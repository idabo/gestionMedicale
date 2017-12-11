package com.gestion.medicale.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.medicale.dao.SigneRepository;
import com.gestion.medicale.entities.Signe;

@Service
public class SigneMetierImpl implements SigneMetier{

	@Autowired
	private SigneRepository signeRepository;
	
	@Override
	public Signe addSigne(Signe si) {
		// TODO Auto-generated method stub
		return signeRepository.save(si);
	}

	@Override
	public Signe getSigne(Long code) {
		// TODO Auto-generated method stub
		return signeRepository.findOne(code);
	}

	@Override
	public Signe modifySigne(Long code, Signe si) {
		// TODO Auto-generated method stub
		si.setCodeSigne(code);
		return signeRepository.save(si);
	}

	@Override
	public boolean deleteSigne(Long code) {
		// TODO Auto-generated method stub
		signeRepository.delete(code);
		return true;
	}

	@Override
	public List<Signe> listSigne() {
		// TODO Auto-generated method stub
		return signeRepository.findAll();
	}

	@Override
	public List<Signe> signeParMC(String mc) {
		// TODO Auto-generated method stub
		return null;
	}

}
