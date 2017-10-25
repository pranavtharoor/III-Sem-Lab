import java.io.*;
import java.io.FileNotFoundException;

class Lab10_Encrypt {
	public static void main(String args[]) throws FileNotFoundException, IOException {
		FileInputStream fi = new FileInputStream("/media/pranav/5474469E7446832A/Coding/III Sem/III-Sem-Lab/OOPs/lab/Lab10_Encrypt.java");
		FileOutputStream foe = new FileOutputStream("/media/pranav/5474469E7446832A/Coding/III Sem/III-Sem-Lab/OOPs/lab/Lab10_Encrypt-enc-out.txt");
		FileOutputStream fod = new FileOutputStream("/media/pranav/5474469E7446832A/Coding/III Sem/III-Sem-Lab/OOPs/lab/Lab10_Encrypt-dec-out.txt");
		byte a[]= new byte[fi.available()];
		fi.read(a, 0, a.length);
		for(byte b: a)
			foe.write((char)(b ^ 0b11111111));
		fi.read(a, 0, a.length);
		fi = new FileInputStream("/media/pranav/5474469E7446832A/Coding/III Sem/III-Sem-Lab/OOPs/lab/Lab10_Encrypt-enc-out.txt");
		fi.read(a, 0, a.length);
		for(byte b: a)
			fod.write((char)(b ^ 0b11111111));
	}
}