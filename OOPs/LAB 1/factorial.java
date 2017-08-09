//Prints factorial of a number

class factorial {
	public static void main(String args[]) {
		int a = Integer.parseInt(args[0]);
		int f = 1;
		for(int i = 1; i <= a; i ++) {
			f *= i;
		}
		System.out.println(a + "! = " + f);
	}
}