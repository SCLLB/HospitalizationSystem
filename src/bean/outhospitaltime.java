package bean;

public class outhospitaltime {
	private String OutHospitalTime;
	private int PatientId;
	private int DoctorId;
	private int PrescriptionId;
	private int BillId;
	public String getOutHospitalTime() {
		return OutHospitalTime;
	}
	public void setOutHospitalTime(String outHospitalTime) {
		OutHospitalTime = outHospitalTime;
	}
	public int getPatientId() {
		return PatientId;
	}
	public void setPatientId(int patientId) {
		PatientId = patientId;
	}
	public int getDoctorId() {
		return DoctorId;
	}
	public void setDoctorId(int doctorId) {
		DoctorId = doctorId;
	}
	public int getPrescriptionId() {
		return PrescriptionId;
	}
	public void setPrescriptionId(int prescriptionId) {
		PrescriptionId = prescriptionId;
	}
	public int getBillId() {
		return BillId;
	}
	public void setBillId(int billId) {
		BillId = billId;
	}
	
}
