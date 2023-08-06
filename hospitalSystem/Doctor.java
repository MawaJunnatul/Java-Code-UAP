package hospitalSystem;

public class Doctor extends Personal {

	private String speciality;
	private int maxAppointmentperDay;
	public Doctor(String name, String id, String gender, int age, String speciality, int maxAppointmentperDay) {
		super(name, id, gender, age);
		this.speciality = speciality;
		this.maxAppointmentperDay = maxAppointmentperDay;
	}
	
	public void addAppointment(String patientId) {
		
		if (getAppointments().size() <= maxAppointmentperDay) {
			int serial = (int) getAppointments().size();
			Appointment appo = new Appointment(super.getId(), patientId, "Scheduled", serial+=1);
			super.addAppointment(appo);
		}
	}

	// For updating appointment status
	public void meetPatient(String patientId) {
		Appointment ap = getAppointment(getId(), patientId);
		if (ap != null && ap.getstatus().equalsIgnoreCase("Scheduled"))
			ap.setStatus("Visited");
	}

	@Override
	public String toString() {
		return super.toString() + "\n\tSpeciality: " + speciality.toUpperCase() + "\tMaxAppointmentPerDay: "
				+ maxAppointmentperDay;
	}
	
     public String getSpeciality() {
	return speciality;
}

   public int getMaxAppointmentPerDay() {
	return maxAppointmentperDay;
}

public void addPatientRecord(PatientRecord pr) {
	
}
}

