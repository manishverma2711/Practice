package javaprac;

public class leftsidetrinagle {

	public static void main(String[] args) {
		
		String Inputstr  ="Tester is on work";
		
		String  searchstr = "on";
		

		int i=0,c=0;
		int j=searchstr.length();
		
		while(j<= Inputstr.length())
		{
			String Substr = Inputstr.substring(i, j);
			
			if(Substr.equals(searchstr)) {
				
				c++;
				
			}
			
			i++;
			j++;
			
		}
		
		System.out.println("The value same input string is " + c);
		
		
		
		
	}
	
}
