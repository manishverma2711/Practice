package javaprac;


public class Test extends Parent {
	void sample() {
		super.sample(); // Parent ka sample
		int xyz = super.abc;
		System.out.println("Updated value: "+abc + xyz);
	}
	
 public static void main(String[] args) {
	
} {
		Test t1 = new Test();
		t1.sample(); // Test ka sample
//		t1.newSample(); // Test ka sample
		
		Parent p1 = new Parent();
		p1.sample();
	}
}