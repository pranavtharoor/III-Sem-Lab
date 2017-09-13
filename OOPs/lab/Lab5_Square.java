
package lab;

// Computes square

public class Lab5_Square {
	public static void main(String args[]) {
		System.out.println(square(3));
		System.out.println(square(0.2));
	}
        
        // Returns square of integer
	public static int square(int x) {
		return x * x;
	}
        
        // Returns square of double value
	public static double square(double x) {
		return x * x;
	}
}