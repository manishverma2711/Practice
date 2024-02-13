package javaprac;

import java.util.Scanner;

public class Inputfromuserpalindrome {

	public static void main(String[] args) {
		
		System.out.println("Enter a number: ");
		
		 Scanner sc = new Scanner (System.in);
		   
		
		 int num = sc.nextInt() , reversedNum = 0, remainder;  
		    int originalNum = num;
		    
		   
		    while (num != 0) {
		      remainder = num % 10;
		      reversedNum = reversedNum * 10 + remainder;
		      num /= 10;
		    }
		    
		    if (originalNum == reversedNum) {
		      System.out.println(originalNum + " is Palindrome.");
		    }
		    else {
		      System.out.println(originalNum + " is not Palindrome.");
		    }
	}	
}
