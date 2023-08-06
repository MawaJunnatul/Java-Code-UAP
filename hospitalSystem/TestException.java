package hospitalSystem;

public class TestException  extends Exception{

	
	
	
	public TestException(String id) {
		super("Invalid Doctor."+id);
		
		
	}
}
