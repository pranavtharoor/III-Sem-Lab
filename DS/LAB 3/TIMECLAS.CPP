#include <iostream.h>
#include <conio.h>

class Time {
	int hour, min, sec;
	public:
	void read() {
		cout << "\nEnter number of hours: ";
		cin >> hour;
		cout << "Enter number of mins: ";
		cin >> min;
		cout << "Enter number of seconds: ";
		cin >> sec;
	}
	Time add(Time t1, Time t2) {
		Time t;
		t = t1;
		return t;
	}
	void display() {
		cout << "Hours: " << hour << "\tMins: " << min
		<< "\tSecs: " << sec;
	}
};

void main() {
	clrscr();
	Time t1, t2, t3;
	cout << "Time 1\n------";
	t1.read();
	cout << "\nTime 2\n-----";
	t2.read();
	t3 = t1.add(t1, t2);
	cout << "\nSum:\n";
	t3.display();
      //	t3 = t1.diff(t1, t2);
	cout << "\Difference:\n";
	t3.display();
	getch();
}