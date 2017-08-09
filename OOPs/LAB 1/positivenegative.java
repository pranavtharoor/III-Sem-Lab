// To check sign of numbers

class positivenegative {
	public static void main(String args[]) {
		int p = 0, n = 0, z = 0;
		for(int i = 0; i < args.length; i++) {
			if(Integer.parseInt(args[i]) > 0)
				p++;
			else if(Integer.parseInt(args[i]) < 0)
				n++;
			else
				z++;
		}
		System.out.println("No. of positive numbers: " + p + "\nNo. of negative numbers: " + n + "\nNo. of zeroes: " + z);
	}
}