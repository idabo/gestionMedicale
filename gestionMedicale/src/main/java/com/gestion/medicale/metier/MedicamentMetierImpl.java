package com.gestion.medicale.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.medicale.dao.MedicamentRepository;
import com.gestion.medicale.entities.Medicament;

@Service
public class MedicamentMetierImpl implements MedicamentMetier{

	@Autowired
	private MedicamentRepository medicamentRepository;
	
	@Override
	public Medicament addMedicament(Medicament me) {
		// TODO Auto-generated method stub
		return medicamentRepository.save(me);
	}

	@Override
	public Medicament getMedicament(Long code) {
		// TODO Auto-generated method stub
		return medicamentRepository.findOne(code);
	}

	@Override
	public Medicament modifyMedicament(Long code, Medicament me) {
		// TODO Auto-generated method stub
		me.setCodeMedicament(code);
		return medicamentRepository.save(me);
	}

	@Override
	public boolean deleteMedicament(Long code) {
		// TODO Auto-generated method stub
		medicamentRepository.delete(code);
		return true;
	}

	@Override
	public List<Medicament> listMedicament() {
		// TODO Auto-generated method stub
		return medicamentRepository.findAll();
	}

	@Override
	public List<Medicament> medicamentParMC(String mc) {
		// TODO Auto-generated method stub
		return null;
	}

}
