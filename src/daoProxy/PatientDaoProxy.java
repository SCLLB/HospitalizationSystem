package daoProxy;

import java.sql.SQLException;

import bean.bed;
import bean.patient;
import dao.DBConnection;
import dao.PatientDao;
import daoImpl.PatientDaoImpl;

public class PatientDaoProxy implements PatientDao {

	private DBConnection dbc = null;  //����ʵ�����ݿ�����
	private PatientDao pdao = null;    //����ʵ����DAO�ӿ�
	
	public PatientDaoProxy() throws ClassNotFoundException, SQLException {
		this.dbc = new DBConnection();   // ʵ�������ݿ�����
		this.pdao = new PatientDaoImpl(this.dbc.getConnection());
	}
	
	@Override
	public boolean AddPatient(patient pat) throws Exception {
		// TODO Auto-generated method stub
		boolean flag = false;
		flag = this.pdao.AddPatient(pat);    //������ʵ����
		this.dbc.close();
		return flag;
	}

	@Override
	public boolean AddBed(bed b) throws Exception {
		// TODO Auto-generated method stub
		boolean flag = false;
		flag = this.pdao.AddBed(b);
		this.dbc.close();
		return flag;
	}

}
