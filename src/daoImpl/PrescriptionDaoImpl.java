package daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;

import bean.patient;
import bean.prescription;
import dao.PrescriptionDao;

public class PrescriptionDaoImpl implements PrescriptionDao {

	private PreparedStatement pstmt = null;
	private Connection conn = null;
	
	public PrescriptionDaoImpl(Connection conn) {
		this.conn = conn;
	}
	
	@Override
	public boolean AddPrescription(prescription pres) throws Exception {
		// TODO Auto-generated method stub
		boolean flag = false;
		String sql = "insert into prescription(DoctorId,PatientId,CheckId,PrescriptionText) values(?,?,?,?)";
		this.pstmt = this.conn.prepareStatement(sql);
		this.pstmt.setInt(1, pres.getDoctorId());
		this.pstmt.setInt(2, pres.getPatientId());
		this.pstmt.setInt(3, pres.getCheckId());
		this.pstmt.setString(4, pres.getPrescriptionText());
		this.pstmt.executeUpdate();
		flag = true;
		this.pstmt.close();
		return flag;
	}

	@Override
	public boolean DeletePrescription(prescription pres) throws Exception {
		// TODO Auto-generated method stub
		boolean flag = false;
		String sql = "delete from prescription where PrescriptionId=?";
		this.pstmt = this.conn.prepareStatement(sql);
		this.pstmt.setInt(1, pres.getPrescriptionId());
		this.pstmt.executeUpdate();
		flag = true;
		this.pstmt.close();
		return flag;
	}

	@Override
	public boolean UpdatePatient(patient pat) throws Exception {
		// TODO Auto-generated method stub
		boolean flag = false;
		String sql = "update patient set PrescriptionText=? where PatientId=?";
		this.pstmt = this.conn.prepareStatement(sql);
		this.pstmt.setString(1, pat.getPrescriptionText());
		this.pstmt.setInt(2, pat.getPatientId());
		this.pstmt.executeUpdate();
		flag = true;
		this.pstmt.close();
		return flag;
	}

	@Override
	public boolean UpdatePrescription(prescription pres) throws Exception {
		// TODO Auto-generated method stub
		boolean flag = false;
		String sql = "update prescription set PrescriptionText=? where PrescriptionId=?";
		this.pstmt = this.conn.prepareStatement(sql);
		this.pstmt.setString(1, pres.getPrescriptionText());
		this.pstmt.setInt(2, pres.getPrescriptionId());
		this.pstmt.executeUpdate();
		flag = true;
		this.pstmt.close();
		return flag;
	}

}
