#include <iostream.h>
#include <conio.h>

#define max 20

class stack {
	int s[20], top;
	public:
		stack() {
			top = 0;
		}
		void push(int a) {
			if(top < max)
				s[top++] = a;
		}
		int pop() {
			if(top - 1 >= 0)
				return s[--top];
			return -1;
		}
		int peek() {
			if(top - 1 >= 0)
				return s[top - 1];
			return -1;
		}
};


void main() {
	clrscr();
	stack s;
	int num;
	cout << "Enter number(base 10): ";
	cin >> num;
	cout << "Enter base: ";
	int base;
	cin >> base;
	while(num > 0) {
		s.push(num % base);
		num /= base;
	}
	char a = 'A';
	while(s.peek() != -1) {
		if(s.peek() >= 10) {
			a += s.pop() - 10;
			cout << a;
		} else cout << s.pop();
	}
	getch();
}