package com.gestion.medicale.metier;

import java.util.List;

import com.gestion.medicale.entities.Patient;
import com.gestion.medicale.entities.Signe;

public interface PatientMetier {
	public Patient addPatient(Patient pa);
	public Patient getPatient(Long code);
	public Patient modifyPatient(Long code, Patient pa);
	public boolean deletePatient(Long code);
	public List<Patient> listPatient();
	public List<Patient> patientParMC(String mc);

}
