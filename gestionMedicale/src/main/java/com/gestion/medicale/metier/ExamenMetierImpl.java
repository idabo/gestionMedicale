package com.gestion.medicale.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.medicale.dao.ExamenRepository;
import com.gestion.medicale.entities.Examen;

@Service
public class ExamenMetierImpl implements ExamenMetier{

	@Autowired
	private ExamenRepository examenRepository;
	@Override
	public Examen addExamen(Examen ex) {
		// TODO Auto-generated method stub
		return examenRepository.save(ex);
	}

	@Override
	public Examen getExamen(Long code) {
		// TODO Auto-generated method stub
		return examenRepository.findOne(code);
	}

	@Override
	public Examen modifyExamen(Long code, Examen ex) {
		// TODO Auto-generated method stub
		ex.setCodeExamen(code);
		return examenRepository.save(ex);
	}

	@Override
	public boolean deleteExamen(Long code) {
		// TODO Auto-generated method stub
		examenRepository.delete(code);
		return true;
	}

	@Override
	public List<Examen> listExamen() {
		// TODO Auto-generated method stub
		return examenRepository.findAll();
	}

	@Override
	public List<Examen> examenParMC(String mc) {
		// TODO Auto-generated method stub
		return null;
	}

}
