package com.gestion.medicale.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.medicale.dao.LivMedicamentRepository;
import com.gestion.medicale.entities.LivMedicament;

@Service
public class LivMedicamentMetierImpl implements LivMedicamentMetier{
	
	@Autowired
	private LivMedicamentRepository livMedicamentRepository;

	@Override
	public LivMedicament addLivMedicament(LivMedicament lm) {
		// TODO Auto-generated method stub
		return livMedicamentRepository.save(lm);
	}

	@Override
	public LivMedicament getLivMedicament(Long code) {
		// TODO Auto-generated method stub
		return livMedicamentRepository.findOne(code);
	}

	@Override
	public LivMedicament modifyLivMedicament(Long code, LivMedicament lm) {
		// TODO Auto-generated method stub
		lm.setCodeLivMedicament(code);
		return livMedicamentRepository.save(lm);
	}

	@Override
	public boolean deleteLivMedicament(Long code) {
		// TODO Auto-generated method stub
		livMedicamentRepository.delete(code);
		return true;
	}

	@Override
	public List<LivMedicament> listLivMedicament() {
		// TODO Auto-generated method stub
		return livMedicamentRepository.findAll();
	}

	@Override
	public List<LivMedicament> livMedicamentParMC(String mc) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
