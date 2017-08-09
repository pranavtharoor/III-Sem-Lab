//Checks if a string is a palindrome
class palindrome {
	public static void main(String args[]) {
		String a = args[0];
		boolean flag = true;
		for(int i = 0; i < a.length() / 2; i++) {
			if(a.charAt(i) != a.charAt(a.length() - i - 1))
				flag = false;
		}
		if(flag)
			System.out.println("Palindrome");
		else
			System.out.println("Not palindrome");
	}
}