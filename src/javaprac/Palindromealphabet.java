package javaprac;

public class Palindromealphabet {

	public static void main(String[] args) {
		
		
		String intial= "maam";
		
		StringBuffer ref = new StringBuffer(intial);
		ref.reverse();
		
		String reff = ref.toString();
		
		if(intial.equals(reff)) {
			System.out.println(" Its palindrome ");
		}
		else {
			
			System.out.println(" Its not palindrome ");

		}
		
		
	}
}
