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

int main() {
	clrscr();
	stack s;
	char a[30], b[30];
	cout << "Enter expression:\n";
	cin >> a;
	int j = 0;
	for(int i = 0; a[i] != '\0'; i++) {
		if(a[i] == '(') s.push(a[i]);
		else if(a[i] == ')') {
			while(s.peek() != '(')
				b[j++] = s.pop();
			s.pop();
		} else if((a[i] == '*' || a[i] == '/') && (s.peek() == '+' || s.peek() == '-'))
			s.push(a[i]);
		else if((a[i] == '+' || a[i] == '-') && (s.peek() == '*' || s.peek() == '/'))
			b[j++] = a[i];
		else if(a[i] > 'z' || a[i] < 'a') s.push(a[i]);
		else b[j++] = a[i];
	}
	while(!s.isEmpty()) if(s.peek() != '(') b[j++] = s.pop();
	b[j] = '\0';
	cout << "Postfix form: " << b;
	getch();
	return 0;
}