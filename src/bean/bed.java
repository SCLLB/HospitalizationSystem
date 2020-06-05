package bean;

public class bed {
	private int BedId;
	private String PatientName;
	private String Condition;
	public int getBedId() {
		return BedId;
	}
	public void setBedId(int bedId) {
		BedId = bedId;
	}
	public String getPatientName() {
		return PatientName;
	}
	public void setPatientName(String patientName) {
		PatientName = patientName;
	}
	public String getCondition() {
		return Condition;
	}
	public void setCondition(String condition) {
		Condition = condition;
	}
	public bed() {
		this.BedId=-1;
		this.PatientName="";
		this.Condition="";
	}
	public bed(int BedId,String PatientName,String Condition) {
		super();
		this.BedId=BedId;
		this.PatientName=PatientName;
		this.Condition=Condition;
	}
}
