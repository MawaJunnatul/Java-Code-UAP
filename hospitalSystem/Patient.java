package hospitalSystem;

public class Patient extends Personal {
	
	
	public Patient(String Name, String id, String gender, int age) {
		super(Name,id,gender,age);
}
	public Appointment getAppointment(String doctorId) {
		return super.getAppointment(doctorId, super.getId());
	}
	public boolean hasAppointment(String doctorId) {
		if(getAppointment(doctorId, super.getId())== null)
			return false;
		else 
			return true;
	}
	public void addAppointment(String doctorId) {
		
		
	}
}
	


