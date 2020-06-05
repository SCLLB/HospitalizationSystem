package dao;

import bean.bed;
import bean.patient;

public interface PatientDao {
	public boolean AddPatient(patient pat)throws Exception;
	public boolean AddBed(bed b)throws Exception;
}
