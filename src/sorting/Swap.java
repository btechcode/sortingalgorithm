package sorting;

public class Swap {
	
	public static void main(String[] args) {
		
		int a = 100;
		int b = 200;
		
		System.out.println("Before swap");
		System.out.println("A: " + a);
		System.out.println("B: " + b);
		
		
		a = a + b;
		b = a -b;
		a = a -b;
		
		
		System.out.println("After swap");
		System.out.println("A: " + a);
		System.out.println("B: " + b);
	}

}
