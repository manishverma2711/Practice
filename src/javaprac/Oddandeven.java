package javaprac;

import java.util.Scanner;

public class Oddandeven {
public static void main(String[] args) {
		
		System.out.println("Enter a number: ");
		
		Scanner sc= new  Scanner(System.in);
		int i= sc.nextInt();

		
		if(i%2==0) {
			
			System.out.println("Its even number :" + i);
		}
		else {
			
			System.out.println("Its odd number: " + i);
		}
		
		
	}
}
