#include <iostream.h>
#include <conio.h>

#define max 20

class stack {
	char s[max];
	int top;
	public:
		stack() {
			top = 0;
		}
		void push(char a) {
			if(top < max) {
				s[top] = a;
				top++;
			}
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
};

void main() {
	clrscr();
	stack s;
	cout << "Enter string: ";
	char str[100];
	cin >> str;
	int l;
	for(l = 0; str[l] != '\0'; l++);
	int m;
	if(l % 2 == 0) m = l / 2;
	else m = l / 2 + 1;
	int flag = 1;
	for(int i = 0; i < l; i++) {
		if(i < l / 2)
			s.push(str[i]);
		else if(i >= m)
			if(str[i] != s.pop())
				flag = 0;
	}
	if(flag) cout << "Palindrome";
	else cout <<"Not Palindrome";
	getch();
}