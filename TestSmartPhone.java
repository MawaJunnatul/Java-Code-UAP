package hasibthecoder;

public class TestSmartPhone {

	public static void main(String[] args)
	{
		SmartPhone sm = new SmartPhone("Nokia1200",4,12.3f,63.12f);
		sm.call();
		sm.runApp();
		sm.takePicture();
		
		System.out.println(sm.getraminfo());
		sm.display();

	}

}
