package bean;

public class patient {
	private int PatientId;
	private String PatientName;
	private String PatientSex;
	private int PatientAge;
	private String PatientAddress;
	private String PatientPhone;
	private int BedId;
	private int DoctorId;
	private int CheckId;
	private String PrescriptionText;
	private double Money;
	private String InHospitalTime;
	private String OutHospitalTime;
	public int getPatientId() {
		return PatientId;
	}
	public void setPatientId(int patientId) {
		PatientId = patientId;
	}
	public String getPatientName() {
		return PatientName;
	}
	public void setPatientName(String patientName) {
		PatientName = patientName;
	}
	public String getPatientSex() {
		return PatientSex;
	}
	public void setPatientSex(String patientSex) {
		PatientSex = patientSex;
	}
	public int getPatientAge() {
		return PatientAge;
	}
	public void setPatientAge(int patientAge) {
		PatientAge = patientAge;
	}
	public String getPatientAddress() {
		return PatientAddress;
	}
	public void setPatientAddress(String patientAddress) {
		PatientAddress = patientAddress;
	}
	public String getPatientPhone() {
		return PatientPhone;
	}
	public void setPatientPhone(String patientPhone) {
		PatientPhone = patientPhone;
	}
	public int getBedId() {
		return BedId;
	}
	public void setBedId(int bedId) {
		BedId = bedId;
	}
	public int getDoctorId() {
		return DoctorId;
	}
	public void setDoctorId(int doctorId) {
		DoctorId = doctorId;
	}
	public int getCheckId() {
		return CheckId;
	}
	public void setCheckId(int checkId) {
		CheckId = checkId;
	}
	public String getPrescriptionText() {
		return PrescriptionText;
	}
	public void setPrescriptionText(String PrescriptionText) {
		this.PrescriptionText = PrescriptionText;
	}
	public double getMoney() {
		return Money;
	}
	public void setMoney(double money) {
		Money = money;
	}
	public String getInHospitalTime() {
		return InHospitalTime;
	}
	public void setInHospitalTime(String inHospitalTime) {
		InHospitalTime = inHospitalTime;
	}
	public String getOutHospitalTime() {
		return OutHospitalTime;
	}
	public void setOutHospitalTime(String outHospitalTime) {
		OutHospitalTime = outHospitalTime;
	}
	public patient() {
		this.PatientId=0;
		this.PatientName="";
		this.PatientSex="";
		this.PatientAge=0;
		this.PatientAddress="";
		this.PatientPhone="";
		this.BedId=0;
		this.DoctorId=0;
		this.CheckId=-1;
		this.PrescriptionText="null";
		this.Money=0;
		this.InHospitalTime="";
		this.OutHospitalTime="";
	}
	public patient(int PatientId,String PatientName,String PatientSex,int PatientAge,String PatientAddress,String PatientPhone,
			int BedId,int DoctorId,int CheckId,String PrescriptionText,double Money,String InHospitalTime,String OutHospitalTime) {
		super();
		this.PatientId=PatientId;
		this.PatientName=PatientName;
		this.PatientSex=PatientSex;
		this.PatientAge=PatientAge;
		this.PatientAddress=PatientAddress;
		this.PatientPhone=PatientPhone;
		this.BedId=BedId;
		this.DoctorId=DoctorId;
		this.CheckId=CheckId;
		this.PrescriptionText=PrescriptionText;
		this.Money=Money;
		this.InHospitalTime=InHospitalTime;
		this.OutHospitalTime=OutHospitalTime;
	}
}
