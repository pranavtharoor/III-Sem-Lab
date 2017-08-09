//Prints odd numbers from 1 to 100

class oddnumbers {
	public static void main(String args[]) {
		System.out.println("The odd numbers are: ");
		for(int i = 1; i < 100; i += 2) {
			System.out.print(i);
			if(i != 99)
				System.out.print(", ");
		}
	}
}