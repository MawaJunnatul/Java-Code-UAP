package hospitalSystem;
import java.util.ArrayList;


public class Hospital {

	
	String Name;
	private ArrayList<Doctor> doctors = new ArrayList<>();
	private ArrayList<Patient> patients = new ArrayList<>();
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public ArrayList<Doctor> getDoctors() {
		return doctors;
	}
	public void setDoctors(ArrayList<Doctor> doctors) {
		this.doctors = doctors;
	}
	public ArrayList<Patient> getPatients() {
		return patients;
	}
	public void setPatients(ArrayList<Patient> patients) {
		this.patients = patients;
	}
	   
	public  Hospital(String Name) {
		this.Name= Name;
	}
		public void addNewPatient (String Name, String id, String gender, int age) {
			
			Patient p = new Patient(Name,id,gender,age);
			patients.add(p);
			
		}
			
		public void addDoctor(String Name, String id, String gender,String speciality,int age,int maxAppointments)	{
			
		Doctor d = new Doctor(Name,id,gender,maxAppointments, speciality,age);
			doctors.add(d)	;
		}
				
				
			public  void makeAppointment(String doctorId, String patientId) {
				
				Doctor doc = findDoctor1(doctorId);
				Patient p = findPatient1(patientId);
				if (doc != null && p != null) {
					doc.addAppointment(patientId);
					p.addAppointment(doctorId);
				}
			}
			private Doctor findDoctor1(String doctorId)  {
				
				return null;
			}
			private Patient findPatient1(String patientId) {
				
				return null;
			}

			public void meetDoctor(String doctorId, String patientId, String symptoms, String prescription) {
				Doctor doc = findDoctor1(doctorId);
				Patient p = findPatient1(patientId);
				PatientRecord pr = new PatientRecord(doctorId, patientId, symptoms, prescription);
				
				if (doc != null && p != null) {
					doc.meetPatient(patientId);
					doc.addPatientRecord(pr);
					pr.addPatientRecord(pr);
				}
			}

			public Doctor findDoctor(String id)throws TestException {
				for (int i = 0; i < doctors.size(); i++) {
					if (doctors.get(i).getId().equals(id))
						return doctors.get(i);
				}
				throw new TestException(id);
			}

			public Patient findPatient(String id) {
				for (int i = 0; i < patients.size(); i++) {
					if (patients.get(i).getId().equals(id))
						return patients.get(i);
				}
				return null;
			}

			public ArrayList<Appointment> getAppointments(String id, boolean isDoctor) {
				if (isDoctor == true) {
					Doctor doc = findDoctor1(id);
					if (doc != null)
						return doc.getAppointments();
					else
						System.out.println("\tDoctor not Found !");
				} else if (isDoctor == false) {
					Patient pa = findPatient1(id);
					if (pa != null)
						return pa.getAppointments();
					else
						System.out.println("\tPatient not Found !");
				}
				return null;
			}

			public ArrayList<Appointment> getActiveAppointments(String id, boolean isDoctor) {
				if (isDoctor) {
					Doctor doc = findDoctor1(id);
					if (doc != null)
						return doc.getAppointments("Scheduled");
					else
						System.out.println("\tDoctor not Found !");
				} else if (isDoctor == false) {
					Patient p = findPatient1(id);
					if (p != null)
						return p.getAppointments("Scheduled");
					else
						System.out.println("\tPatient not Found !");
				}
				return null;
			}
		
			
			
			
		
	}
		

