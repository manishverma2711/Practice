package javaprac;

import java.util.Scanner;

public class findtheprimenumber {
	
	public static void main(String[] args) {

		
		System.out.println("Please enter number: ");
	    int num;
	    Scanner ok = new Scanner(System.in);
	    num= ok.nextInt();
	    
	    
	    
	    boolean flag = false;
	    for (int i = 2; i <= num / 2; ++i) {
	      if (num % i == 0) {
	        flag = true;
	        break;
	      }
	    }

	    if (!flag)
	      System.out.println(num + " is a prime number.");
	    else
	      System.out.println(num + " is not a prime number.");
	}

}
