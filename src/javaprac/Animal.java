package javaprac;

public class Animal extends humans {
  
	public void dog() 
	{
		System.out.println("This is dog class");
	} 
	
	public void callSuperDog() {
		super.dog();
	}
	
	public static void main(String[] args) {
		Animal a1 = new Animal();
		
		a1.callSuperDog();
		a1.dog();		 
	}
		
}
  class humans{
	 
	  public void dog() 
	  {
		  System.out.println("This is cat classes");
	  }	
 }
  
  
  
 