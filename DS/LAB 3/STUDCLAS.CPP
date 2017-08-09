#include <iostream.h>
#include <conio.h>
#include <stdio.h>

class Student {
  int rollno;
  char name[100];
  char grade;
  public:
  void read() {
	cout << "\nEnter roll No.: ";
	cin >> rollno;
	cout << "Enter name: ";
	gets(name);
	cout << "Enter grade: ";
	cin >> grade;
  }
  void sort(Student *s, int n);
  void display() {
	cout << "\nRoll No.: " << rollno << "\tName: " << name << "\tGrade: " << grade;
  }
};
void Student::sort(Student *s, int n) {
	for(int i = 0; i < n; i++)
		for(int j = 0; j < n - i - 1; j++)
			if(s[j].rollno > s[j + 1].rollno) {
				Student temp;
				temp = s[j];
				s[j] = s[j + 1];
				s[j + 1] = temp;
			}
}

void main() {
	clrscr();
	Student s[100], a;
	int n;
	cout << "Enter number of students: ";
	cin >> n;
	cout << "\nEnter student details:\n";
	for(int i = 0; i < n; i++)
		s[i].read();
	a.sort(s, n);
	cout << "Sorted student details:\n";
	for(i = 0; i < n; i++)
		s[i].display();
	getch();
}