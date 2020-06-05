package bean;

public class prescription {
	private int PrescriptionId;
	private String PrescriptionText;
	private int DoctorId;
	private int PatientId;
	private int CheckId;
	public int getPrescriptionId() {
		return PrescriptionId;
	}
	public void setPrescriptionId(int prescriptionId) {
		PrescriptionId = prescriptionId;
	}
	public String getPrescriptionText() {
		return PrescriptionText;
	}
	public void setPrescriptionText(String prescriptionText) {
		PrescriptionText = prescriptionText;
	}
	public int getDoctorId() {
		return DoctorId;
	}
	public void setDoctorId(int doctorId) {
		DoctorId = doctorId;
	}
	public int getPatientId() {
		return PatientId;
	}
	public void setPatientId(int patientId) {
		PatientId = patientId;
	}
	public int getCheckId() {
		return CheckId;
	}
	public void setCheckId(int checkId) {
		CheckId = checkId;
	}
	public prescription() {
		this.PrescriptionId=0;
		this.PrescriptionText="";
		this.DoctorId=0;
		this.PatientId=0;
		this.CheckId=0;
	}
	public prescription(int PrescriptionId,String PrescriptionText,int DoctorId,int PatientId,int CheckId) {
		super();
		this.PrescriptionId=PrescriptionId;
		this.PrescriptionText=PrescriptionText;
		this.DoctorId=DoctorId;
		this.PatientId=PatientId;
		this.CheckId=CheckId;
	}
}
