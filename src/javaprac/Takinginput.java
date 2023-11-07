package javaprac;

import java.util.Scanner;

public class Takinginput {

	public static void main(String[] args) {

		System.out.println("Please enter a number: ");
		
		Scanner take = new Scanner(System.in);
		
	   int show=take.nextInt();
		
		System.out.println("The value taken from user is: " + show);
		
		
		
	}

}
