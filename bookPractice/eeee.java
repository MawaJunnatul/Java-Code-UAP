package bookPractice;

public class eeee {
	 String Name,post,id;
	 double salary;
	 
	 public eeee (String Name,String post,String id,double sal) {
		 
		 this.Name = Name;
		this.post = post;
		this.id = id;
		this.salary = sal;
	}
	 
	 void increaseSalary(double amt) {
		 if(amt>0) {
		 salary+= amt;
	 }
	 }
	 void promote(String newPost) {
		 
		 this.post=post;
		salary = 1.1 * salary ;
	 }
	 String getId() {
			return id;
		}
		double getSalary() {
			return salary;
}

     void display() {
	System.out.println("Name: "+Name+" Id: "+id+" post: "+post+" Salary: "+salary);
}
}


