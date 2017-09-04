#include <iostream.h>
#include <conio.h>
#include <stdio.h>
#include <string.h>

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

void main() {
	clrscr();
	char prefix[100], res[100], sym[2], a1[100], a2[100];
	stack s1;
	cout<<"enetr the prefix expression\n";
	cin >> prefix;
	strrev(prefix);
	for(int i=0; prefix[i]!='\0'; i++) {
		sym[0]=prefix[i];
		sym[1]='\0';
		if(isOperator(prefix[i]))
		{
			strcpy(a1,s1.pop());
			strcpy(a2,s1.pop());
			strcpy(res,"(");
			strcat(res,a1);
			strcat(res,sym);
			strcat(res,a2);
			strcat(res,")");
			s1.push(res);
		} else s1.push(sym);
	}
	cout<<"Infix expression: " << s1.pop();
	getch();
}