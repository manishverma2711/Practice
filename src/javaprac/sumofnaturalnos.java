package javaprac;

public class sumofnaturalnos {
	

	    public static void main(String[] args) {
	        int number = 20;
	        int sum = addNumbers(number);
	        System.out.println("Sum of all natural numbers = " + sum);
	    }

	    public static int addNumbers(int num) {
	        if (num != 0)
	            return num + addNumbers(num - 1);
	        else
	            return num;
	    }

}
