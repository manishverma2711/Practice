package javaprac;


  class laptop{
 
	 void display()
	 {
		 System.out.println("First class: ");
	 }	  
  }

  class Mobile extends laptop { 
	  
	  void display() {
		  
		  System.out.println("Second Class: ");
		  
	  } 
  }

public class Device {

	public static void main(String[] args) {
		
		laptop reff = new laptop();
		reff.display();  
		
		Mobile ress = new Mobile();
		ress.display();

		
	}

}
