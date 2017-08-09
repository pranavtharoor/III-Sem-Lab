//Basic arithmetic operations

import java.util.Scanner;
class operations {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		System.out.println("Sum: " + (a + b));
		System.out.println("Difference: " + (a - b));
		System.out.println("Product: " + (a * b));
		System.out.println("Quotient: " + (a / b));
		System.out.println("Remainder: " + (a % b));
	}
}