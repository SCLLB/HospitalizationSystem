package bean;

public class bill {
	private int BillId;
	private int PatientId;
	private int PrescriptionId;
	private int CheckId;
	private double Money;
	public int getBillId() {
		return BillId;
	}
	public void setBillId(int billId) {
		BillId = billId;
	}
	public int getPatientId() {
		return PatientId;
	}
	public void setPatientId(int patientId) {
		PatientId = patientId;
	}
	public int getPrescriptionId() {
		return PrescriptionId;
	}
	public void setPrescriptionId(int prescriptionId) {
		PrescriptionId = prescriptionId;
	}
	public int getCheckId() {
		return CheckId;
	}
	public void setCheckId(int checkId) {
		CheckId = checkId;
	}
	public double getMoney() {
		return Money;
	}
	public void setMoney(double money) {
		Money = money;
	}
	
}
