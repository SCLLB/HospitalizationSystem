package daoProxy;

import java.sql.SQLException;

import bean.patient;
import bean.prescription;
import dao.DBConnection;
import dao.PrescriptionDao;
import daoImpl.PrescriptionDaoImpl;

public class PrescriptionDaoProxy implements PrescriptionDao {

	private DBConnection dbc = null;
	private PrescriptionDao pdao = null;
	
	public PrescriptionDaoProxy() throws ClassNotFoundException, SQLException {
		this.dbc = new DBConnection();
		this.pdao = new PrescriptionDaoImpl(this.dbc.getConnection());
	}
	
	@Override
	public boolean AddPrescription(prescription pres) throws Exception {
		// TODO Auto-generated method stub
		boolean flag = false;
		flag = this.pdao.AddPrescription(pres);
		this.dbc.close();
		return flag;
	}

	@Override
	public boolean UpdatePatient(patient pat) throws Exception {
		// TODO Auto-generated method stub
		boolean flag = false;
		flag = this.pdao.UpdatePatient(pat);
		this.dbc.close();
		return flag;
	}

	@Override
	public boolean DeletePrescription(prescription pres) throws Exception {
		// TODO Auto-generated method stub
		boolean flag = false;
		flag = this.pdao.DeletePrescription(pres);
		this.dbc.close();
		return flag;
	}

	@Override
	public boolean UpdatePrescription(prescription pres) throws Exception {
		// TODO Auto-generated method stub
		boolean flag = false;
		flag = this.pdao.UpdatePrescription(pres);
		this.dbc.close();
		return flag;
	}
}
