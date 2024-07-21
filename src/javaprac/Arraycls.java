package javaprac;

import java.util.Arrays;

public class Arraycls {
	public static void main(String[] args) {
		
	
	
	int a[]= {1122,1,5,16,0,110};
	int min =a[0];
	
	
	for(int i=0;i<a.length;i++) {	
		if(min>a[i]) {
			
			min=a[i];
		}
	}
	
	System.out.println("The Smallest element in the given array is " +min);	
	}
}
