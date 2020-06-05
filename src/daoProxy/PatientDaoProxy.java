package daoProxy;

import java.sql.SQLException;

import bean.bed;
import bean.patient;
import dao.DBConnection;
import dao.PatientDao;
import daoImpl.PatientDaoImpl;

public class PatientDaoProxy implements PatientDao {

	private DBConnection dbc = null;  //定义实现数据库连接
	private PatientDao pdao = null;    //定义实现类DAO接口
	
	public PatientDaoProxy() throws ClassNotFoundException, SQLException {
		this.dbc = new DBConnection();   // 实例化数据库连接
		this.pdao = new PatientDaoImpl(this.dbc.getConnection());
	}
	
	@Override
	public boolean AddPatient(patient pat) throws Exception {
		// TODO Auto-generated method stub
		boolean flag = false;
		flag = this.pdao.AddPatient(pat);    //调用真实主题
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
