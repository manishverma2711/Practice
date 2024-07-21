package javaprac;

import java.util.Scanner;

public class reversenooutputfromuser {

	public static void main(String[] args) {
	
		 String str= "Manish", nstr="";
	        char ch;
	       
	      System.out.print("Original word: ");
	      System.out.println("Manish"); 
	       
	      for (int i=0; i<str.length(); i++)
	      {
	        ch= str.charAt(i); 
	        nstr= ch+nstr; 
	      }
	      System.out.println("Reversed word: "+ nstr);
		
		
		
	}
	
//	String str ="Manish";
	
}
