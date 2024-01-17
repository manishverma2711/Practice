package javaprac;

public class fruit {

	void eat() {
		int a=10;
		System.out.println("print the no. of times eat" + a );
	}
	
	void drink() {
		String d= "Water";
		System.out.println("print the drink method" + d);
	}
	
public static void main(String[] args) {
   
	fruit ref = new fruit();
	ref.drink();
	
  }			
}
