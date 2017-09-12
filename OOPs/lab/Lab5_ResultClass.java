import java.util.Scanner;

class Result {
	int[][] marks = new int[3][3];
	int[] total = new int[3];
	public void setMarks(int rollNo, int marks[]) {
		for(int i = 0; i < this.marks[rollNo].length; i++)
			this.marks[rollNo][i] = marks[i];
	}
	public void computeTotal() {
		int sum;
		for(int i = 0; i < marks.length; i++) {
			sum = 0;
			for(int j = 0; j < marks[0].length; j++)
				sum += marks[i][j];
			total[i] = sum;
		}
	}
	public void highestSubject() {
		int high, highRollNo;
		for(int i = 0; i < marks[0].length; i++) {
			high = marks[0][i];
			highRollNo = 1;
			for(int j = 0; j < marks.length; j++) {
				if(marks[j][i] > high) {
					highRollNo = j + 1;
					high = marks[j][i];
				}
			}
			System.out.println("\nSubject " + (i + 1) + ":\nHighest mark:" + high + "\nRoll number: " + highRollNo);
		}
	}
	public void highestTotal() {
		int high = total[0];
		int highRollNo = 1;
		for(int i = 0; i < total.length; i++)
			if(total[i] > high) {
				highRollNo = i + 1;
				high = total[i];
			}
		System.out.println("\nHighest total by roll no.: " + highRollNo);
	}
}

public class Lab5_ResultClass {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		Result r = new Result();
		for(int i = 0; i < 3; i++) {
			System.out.println("Enter marks of student in three subjects");
			int[] marks = new int[3];
			for(int j = 0; j < 3; j++) 
				marks[j] = in.nextInt();
			r.setMarks(i, marks);
		}
		r.computeTotal();
		r.highestSubject();
		r.highestTotal();
	}
}