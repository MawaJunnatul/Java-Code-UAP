package hospitalSystem;

import java.util.ArrayList;

public class Personal {

	 private String Name,id,gender;
	  private int age;
	

	    private ArrayList<String> patientRecord = new ArrayList<String>();
	    
	    
	    private ArrayList<Appointment> appointments = new ArrayList<>();


		public Personal(String name, String id, String gender, int age) {
			super();
			Name = name;
			this.id = id;
			this.gender = gender;
			this.age = age;
		}
	    
	     public void addAppointment(Appointment app) {
	    	 
	    	 appointments.add(app);
	     }
	    
	    public void addPatientRecord(String record) {
	    	
	    	patientRecord.add(record);
	    }
	    
	    public Appointment getAppointment(String doctorId,String patientId) {
	    	
	    	for(Appointment apo : appointments) {
				if(apo.getdoctorId().equalsIgnoreCase(doctorId) && apo.getpatientId().equalsIgnoreCase((patientId))&&apo.getstatus().equalsIgnoreCase("Scheduled"))
					return apo;
			}
			return null;
		}
		public ArrayList<Appointment> getAppointments(String status){
			ArrayList<Appointment> appointmentStatus = new ArrayList<>();
			for(Appointment apo : appointments) {
				if(apo.getstatus().equalsIgnoreCase(status)) {
					appointmentStatus.add(apo);
					return appointmentStatus;
				}
			}
			return null;
		}
		@Override
		public String toString() {
			return "[name=" + Name + ", id=" + id + ", gender=" + gender + ", age=" + age
					+ "]";
		}

		public String getName() {
			return Name;
		}

		public void setName(String name) {
			Name = name;
		}

		public String getId() {
			return id;
		}

		public String getGender() {
			return gender;
		}

		public int getAge() {
			return age;
		}

		public ArrayList<String> getPatientRecord() {
			return patientRecord;
		}

		public ArrayList<Appointment> getAppointments() {
			return appointments;
		}

}
	    
	    
	    



