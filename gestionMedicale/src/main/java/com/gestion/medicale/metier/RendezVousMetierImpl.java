package com.gestion.medicale.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.medicale.dao.RendezVousRepository;
import com.gestion.medicale.entities.RendezVous;

@Service
public class RendezVousMetierImpl implements RendezVousMetier{

	@Autowired
	private RendezVousRepository rendezVousRepository;
	@Override
	public RendezVous addRendezVous(RendezVous rv) {
		// TODO Auto-generated method stub
		return rendezVousRepository.save(rv);
	}

	@Override
	public RendezVous getRendezVous(Long code) {
		// TODO Auto-generated method stub
		return rendezVousRepository.findOne(code);
	}

	@Override
	public RendezVous modifyRendezVous(Long code, RendezVous rv) {
		// TODO Auto-generated method stub
		rv.setCodeRV(code);
		return rendezVousRepository.save(rv);
	}

	@Override
	public boolean deleteRendezVous(Long code) {
		// TODO Auto-generated method stub
		rendezVousRepository.delete(code);
		return true;
	}

	@Override
	public List<RendezVous> listRendezVous() {
		// TODO Auto-generated method stub
		return rendezVousRepository.findAll();
	}

	@Override
	public List<RendezVous> rendezVousParMC(String mc) {
		// TODO Auto-generated method stub
		return null;
	}

}
