package bookPractice;
import java.util.Scanner;
public class Testing {
	


	public class Uap {
		

		@SuppressWarnings("null")
		public static void main(String[] args) {
			Scanner scan = null;
		
			Scanner in = new Scanner(System.in).useDelimiter("\r\n");
			String Name=scan.next();
			String id=scan.next();
			String post=scan.next();
			double salary =scan.nextDouble();
			eeee emp = new eeee (Name,id,post,salary);
			
			
			emp.increaseSalary(500);
			emp.promote("examiner");
			emp.increaseSalary(500);
			emp.display();
			scan.close();
		}
	}
			

}
