import java.util.Scanner;

// Compares and changes case of strings

class Lab9_Compare {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two strings: ");
		String str1 = in.next(), str2 = in.next();
		// Compares strings
		if(str1.equals(str2)) System.out.println("Strings are equal");
		else System.out.println("Strings are not equal");
		// Makes string 1 upper case and string 2 lowercase
		System.out.println("Uppercase(string 1) and lowercase(string 2):\n" + str1.toUpperCase() + "\n" + str2.toLowerCase());
		// Checks if string 2 is a substring od string 1
		if(str1.indexOf(str2) != -1) System.out.println("String 2 is a substring of string 1");
		else System.out.println("String 2 in not a substring of string 2");
	}
}