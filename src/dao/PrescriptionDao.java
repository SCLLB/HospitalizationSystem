package dao;

import bean.patient;
import bean.prescription;

public interface PrescriptionDao {
	public boolean AddPrescription(prescription pres)throws Exception;
	public boolean UpdatePatient(patient pat)throws Exception;
	public boolean DeletePrescription(prescription pres)throws Exception;
	public boolean UpdatePrescription(prescription pres)throws Exception;
}
