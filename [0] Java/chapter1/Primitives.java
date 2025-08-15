package chapter1;

// Primitive types
/* 
	1. byte, 
	2. short,
	3. int,
	4. long,
	5. float,
	6. double,
	7. char,
	8. boolean
*/
public class Primitives {
	
	public static void main(String[] args) {

		// byte 
		byte b1 = 1;		
		System.out.println("b1 - "+ b1);
		
		byte b2 = 01;		
		System.out.println("b2 - "+ b2);
		
		// byte b3 = 08;		Fails
		byte b3 = 07;
		System.out.println("b3 - "+ b3);
		
		// short s1 = 1000000; Cannot store this info without loss, causes error
		short s1 = 100;
		System.out.println("s1 - "+ s1);
		
		short s2 = 200;
		System.out.println("s2 - "+ s2);
		
		int i1 = s1 * s2;
		System.out.println("i1 - "+ i1);
		
		// int i2 = 12313123123; too large
		int i2 = 1231312;
		System.out.println("i2 - "+ i2);
		
		// long l1 = 123131312312312312313L; too large
		long l1 = 123123123123L;
		System.out.println("l1 - "+ l1);
		
		float f1 = 100f;
		System.out.println("f1 - "+ f1);
	
		double d1 = 122323d;
		System.out.println("d1 - "+ d1);
		
		char c1 = 65;
		System.out.println("c1 - "+ c1);
		
		boolean bo1 = true;
		System.out.println("bo1 - "+ bo1);
		
		System.out.println("isNan - "+ Double.isNaN(1/0)); // throws exception
	}		
	
}