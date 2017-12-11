package com.gestion.medicale.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.medicale.dao.MaladieRepository;
import com.gestion.medicale.entities.Maladie;

@Service
public class MaladieMetierImpl implements MaladieMetier{

	@Autowired
	private MaladieRepository maladieRepository;
	
	@Override
	public Maladie addMaladie(Maladie ma) {
		// TODO Auto-generated method stub
		return maladieRepository.save(ma);
	}

	@Override
	public Maladie getMaladie(Long code) {
		// TODO Auto-generated method stub
		return maladieRepository.findOne(code);
	}

	@Override
	public Maladie modifyMaladie(Long code, Maladie ma) {
		// TODO Auto-generated method stub
		ma.setCodeMaladie(code);
		return maladieRepository.save(ma);
	}

	@Override
	public boolean deleteMaladie(Long code) {
		// TODO Auto-generated method stub
		maladieRepository.delete(code);
		return true;
	}

	@Override
	public List<Maladie> listMaladie() {
		// TODO Auto-generated method stub
		return maladieRepository.findAll();
	}

	@Override
	public List<Maladie> maladieParMC(String mc) {
		// TODO Auto-generated method stub
		return null;
	}

}
