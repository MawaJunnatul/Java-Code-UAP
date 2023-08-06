package hospitalSystem;

public class Appointment {

	
	 private String doctorId,patientId,status;
	 private int serialNo;
	Appointment(String doctorId, String patientId, String status, int serialNo) {
		super();
		this.doctorId = doctorId;
		this.patientId = patientId;
		this.status = status;
		this.serialNo = serialNo;
	}
	@Override
	public String toString() {
		return "Appointment [doctorId=" + doctorId + ", patientId=" + patientId + ", status=" + status + ", serialNo="
				+ serialNo + "]";
	}
	public String getdoctorId() {
		
		return null;
	}
	public String getpatientId() {
		
		return null;
	}
	public String getstatus() {
		
		return null;
	}
	public void setStatus(String string) {
		
		
	}
	
}
