package hospitalSystem;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PatientRecord {
	
	String doctorId,patientId,symptom,prescription;
	LocalDateTime time;

	PatientRecord(String doctorId, String patientId, String symptom, String prescription) {
		super();
		this.doctorId = doctorId;
		this.patientId = patientId;
		this.symptom = symptom;
		this.prescription = prescription;
		
		 this.time=LocalDateTime.now();
	}

	public String getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public String getSymptom() {
		return symptom;
	}

	public void setSymptom(String symptom) {
		this.symptom = symptom;
	}

	public String getPrescription() {
		return prescription;
	}

	public void setPrescription(String prescription) {
		this.prescription = prescription;
	}

	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-mm-yyyy HH:mm:ss");
	String apptime = time.format(formatter);
	
	@Override
	public String toString() {
		return "PatientRecord [doctorId=" + doctorId + ", patientId=" + patientId + ", symptom=" + symptom
				+ ", prescription=" + prescription + "]";
		
	}

	public void addPatientRecord(PatientRecord pr) {
		
		
	}
	
	
	

}
