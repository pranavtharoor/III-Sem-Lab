// Computes area of rectangle

class areaperimeter {
	public static void main(String args[]) {
		int l = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.println("Area: " + (l * b) + "\nPerimeter: " + (2 * (l + b)));
	}
}