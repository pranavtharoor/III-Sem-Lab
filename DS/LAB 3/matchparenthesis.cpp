#include <iostream>
using namespace std;

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

int main() {
	stack s;
	cout << "Enter expression\n";
	char a[100];
	cin >> a;
	int i = 0;
	while(a[i] != '\0') {
		if(a[i] == '(') s.push(')');
		else if(a[i] == '{') s.push('}');
		else if(a[i] == '[') s.push(']');
		else if(s.peek() == -1 || s.pop() != a[i]) {
			cout << "Invalid";
			return 0;
		}
		i++;
	}
	if(s.peek() == -1) cout << "Valid";
	else cout << "Invalid";
	// int l;
	// for(l = 0; a[l] != '\0'; l++);
	// int flag = 1;
	// for(int i = 0; i a[i] != '\0'; i++) {
	// 	if(a[i] == '(' || a[i] == '{' || a == '[') 
	// 		s.push(a[i]);
	// 	else if(a[i] == ')' || a[i] == '}' || a == ']')
	// 		if(a[i] != s.pop())
	// 			flag = 0;
	// }
	// if(flag) cout << "Correct";
	// else cout << "Incorrect";
	return 0;
}