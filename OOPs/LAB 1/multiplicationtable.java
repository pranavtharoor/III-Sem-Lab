// Prints multiplication table

class multiplicationtable {
	public static void main(String args[]) {
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 11; j++)
				System.out.println(i + " x " + j + " = " + (i * j));
			System.out.println();
		}
	}
}