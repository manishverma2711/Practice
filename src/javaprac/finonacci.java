package javaprac;

public class finonacci {

	public static void main(String[] args) {
		
		int a=1;
		int b=0;
		int c;
		
		System.out.println("The Fibonacci series ");
		for(int i=1;i<10;i++) {
			
       // a+b=c;
	    	c=a+b;
	
			a=b;
			b=c;
			
			System.out.print(c+" ");

		}
			
	}
	
}
