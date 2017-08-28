#include <iostream.h>
#include <conio.h>
#include <string.h>

#define max 20

class stack {
	int top;
	char s[max];
	public:
		stack() {
			top = 0;
		}
		void push(int a) {
			if(top < max)
				s[top++] = a;
		}
		char pop() {
			if(top - 1 >= 0)
				return s[--top];
			return -1;
		}
		char peek() {
			if(top - 1 >= 0)
				return s[top - 1];
			return -1;
		}
		int isEmpty() {
			if(top == 0)
				return 1;
			return 0;
		}
};

int isnumber(char a) {
	if(a <= '9' && a >='0') return 1;
	return 0;
}

char charof(int x) {
	return '0' + x;
}

int main() {
	clrscr();
	stack s;
	char a[30];
	cout << "Enter expression:\n";
	cin >> a;
	for(int i = 0; a[i] != '\0'; i++) {
		if(!isnumber(a[i])) s.push(a[i]);
		else if(isnumber(s.peek())) {
			char t = s.pop();

			char o = s.pop();
			int x = (int)(t - '0');
			int y = (int)(a[i] - '0');
			switch(o) {
				case '+':
					s.push(charof(x + y));
					break;
				case '-':
					s.push(charof(x - y));
					break;
				case '*':
					s.push(charof(x * y));
					break;
				case '/':
					s.push(charof(x / y));
					break;
			}
		} else {
			char o = s.pop();
			if(s.isEmpty() || !isnumber(s.peek())) {
				s.push(o);
				s.push(a[i]);
			} else {
				char t = s.pop();
				int x = (int)(t - '0');
				int y = (int)(a[i] - '0');
				switch(o) {
				case '+':
					s.push(charof(x + y));
					break;
				case '-':
					s.push(charof(x - y));
					break;
				case '*':
					s.push(charof(x * y));
					break;
				case '/':
					s.push(charof(x / y));
					break;
				}
			}
		}
	}
	cout << "Result: " << s.pop();
	getch();
	return 0;
}