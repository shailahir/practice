package chapter1;

public class Variables {
	
	public static final int DAYS_IN_WEEK = 7; // valid		
	
	public static void main(String[] args) {
		int i = 0;
		int j;
		j = 1;
		
		System.out.println("i = "+ i +", j = "+ j);
		
		int k, l, m;
		
		k = 2;
		k = 3;
		l = 4;
		m = 5;
		System.out.println("k = "+ k +", l = "+ l +", m = "+ m);
		
		int _a1 = 10; // valid
		// _ // invalid
		
		int a1_b2= 11; // valid
		
		int x;
		
		// x++; // invalid, intialize first
		x = 0;
		x++; // valid now

		// constants
		
		final int a2 = 100; // valid
		
		final int a3;
		
		a3 = 100; // valid
		// a3 = 101; // invalid
		
		// enums
		
		enum Test { ONE, TWO, THREE };
		
		System.out.println("Test " + Test.ONE );
		
	}
	
}