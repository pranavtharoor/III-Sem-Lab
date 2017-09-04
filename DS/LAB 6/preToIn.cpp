#include <iostream>
#include <conio.h>
#include <string.h>

#define max 20

using namespace std;

class stack {
	int top;
	char s[max][20];
public:
	stack() {
	top = 0;
	}
	void push(char a[]) {
	if(top < max)
		strcpy(s[top++], a);
	}
	char* pop() {
	if(top - 1 >= 0)
		return s[--top];
	}
};

int isOperator(char c ) {
	switch(c) {
		case '/':
		case '*':
		case '+':
		case '-':
		case '^': return 1;
		default: return 0;
	}
}

int main() {
	char prefix[100], res[100], a[2], a1[100], a2[100];
	stack s;
	cout<<"Enter expression: ";
	cin >> prefix;
	strrev(prefix);
	for(int i = 0; prefix[i]! = '\0'; i++) {
		a[0] = prefix[i];
		a[1] = '\0';
		if(isOperator(prefix[i])) {
			strcpy(a1,s.pop());
			strcpy(a2,s.pop());
			strcpy(res,"(");
			strcat(res,a1);
			strcat(res,a);
			strcat(res,a2);
			strcat(res,")");
			s.push(res);
		} else s.push(a);
	}
	cout<<"Infix expression: " << s.pop();
    return 0;
}
