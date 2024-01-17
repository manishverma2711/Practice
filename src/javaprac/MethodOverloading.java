package javaprac;

public class MethodOverloading {
	 int a=10, b=20;

	 void math() {
		 
		 System.out.println("The value of a is " + a);
	 }	
	 void math(int b)	 
	 {
		 
		 System.out.println("The value of b is "+ b); 
	 }
	
	public static void main(String[] args) {
	
		MethodOverloading ref = new MethodOverloading();
		
		ref.math();
	}
	
}
