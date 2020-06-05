package daoFactory;

import java.sql.SQLException;

import dao.PatientDao;
import dao.PrescriptionDao;
import dao.UserDao;
import daoProxy.PatientDaoProxy;
import daoProxy.PrescriptionDaoProxy;
import daoProxy.UserDaoProxy;

public class DaoFactory {
	public static UserDao getUserDaoInstance() throws ClassNotFoundException, SQLException {
		return new UserDaoProxy();
	}
	public static PatientDao getPatientInstance() throws ClassNotFoundException, SQLException {
		return new PatientDaoProxy();
	}
	public static PrescriptionDao getPrescriptionInstance() throws ClassNotFoundException, SQLException {
		return new PrescriptionDaoProxy();
	}
}
