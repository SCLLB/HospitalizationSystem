package daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;

import bean.bed;
import bean.patient;
import dao.PatientDao;

public class PatientDaoImpl implements PatientDao {

	private PreparedStatement pstmt = null;
	private Connection conn = null;
	
	public PatientDaoImpl(Connection conn) {
		this.conn = conn;
	}
	
	@Override
	public boolean AddPatient(patient pat) throws Exception {
		// TODO Auto-generated method stub
		boolean flag = false;
		String sql = "insert into patient(PatientName,PatientSex,PatientAge,PatientAddress,PatientPhone,DoctorId,BedId,InHospitalTime) values(?,?,?,?,?,?,?,?)";
		this.pstmt = this.conn.prepareStatement(sql);
		this.pstmt.setString(1, pat.getPatientName());
		this.pstmt.setString(2, pat.getPatientSex());
		this.pstmt.setInt(3, pat.getPatientAge());
		this.pstmt.setString(4, pat.getPatientAddress());
		this.pstmt.setString(5, pat.getPatientPhone());
		this.pstmt.setInt(6, pat.getDoctorId());
		this.pstmt.setInt(7, pat.getBedId());
		this.pstmt.setString(8, pat.getInHospitalTime());
		this.pstmt.executeUpdate();
		flag = true;
		this.pstmt.close();
		return flag;
	}

	@Override
	public boolean AddBed(bed b) throws Exception {
		// TODO Auto-generated method stub
		boolean flag = false;
		String sql = "update bed set PatientName=? where BedId=?";
		this.pstmt = this.conn.prepareStatement(sql);
		this.pstmt.setString(1, b.getPatientName());
		this.pstmt.setInt(2, b.getBedId());
		this.pstmt.executeUpdate();
		flag = true;
		this.pstmt.close();
		return flag;
	}

}
