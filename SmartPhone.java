package hasibthecoder;

public class SmartPhone {

	String brand;
	int ram;
	float cameraResoulation,size;
    boolean runApp,call,takePicture;
    public SmartPhone(String b,int ram,float cameraR,float size)
    {
    this.cameraResoulation=cameraR;
    this.ram=ram;
    this.size=size;
    this.brand=b;
  
    }
    
    void call() {
    	call=true;
    	System.out.println("hasib is calling");
    	
    }
    
    void runApp() {
    	if(call==true)
    		runApp=true;
    	System.out.println("app is running");
    }
    void takePicture() {
    	
    	System.out.println("PictureTaking");
    }
    int getraminfo() {
    	
    	return ram;
    }
     void display ()
     {
    	 System.out.println("\tbrand="+brand + "\tsize=" +size +"\tcameraResolution="+cameraResoulation + "\t \nram="+ram);
    	 
    	 
     }
}

