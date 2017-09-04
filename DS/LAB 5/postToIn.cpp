#include <iostream>
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

int main() {
	stack s;
	char exp[20], a[2];
	cout << "Enter expression: ";
	cin >> exp;
	int l = strlen(exp);
	for(int i = 0; i < l; i++) {
		if(isalpha(exp[i])) {
			a[0] = exp[i];
			a[1] = '\0';
			s.push(a);
		} else {
			switch(exp[i]) {
				case '+': {
					char op1[10],op2[10];
					strcpy(op2,s.pop());
					strcpy(op1,"(");
					strcat(op1,s.pop());
					strcat(op1,"+");
					strcat(op1,op2);
					strcat(op1,")");
					s.push(op1);
					break;
				}
				case '-': {
					char op2[10] ;
					strcpy(op2,s.pop());
					char op1[10];
					strcpy(op1,"(");
					strcat(op1,s.pop());
					strcat(op1,"-");
					strcat(op1,op2);
					strcat(op1,")");
					s.push(op1);
					break;
				}
				case '*': {
					char op2[10] ;
					strcpy(op2,s.pop());
					char op1[10] ;
					strcpy(op1,"(");
					strcat(op1,s.pop());
					strcat(op1,"*");
					strcat(op1,op2);
					strcat(op1,")");
					s.push(op1);
					break;
				}
				case '/': {
					char op2[10] ;
					strcpy(op2,s.pop());
					char op1[10] ;
					strcpy(op1,"(");
					strcat(op1,s.pop());
					strcat(op1,"/");
					strcat(op1,op2);
					strcat(op1,")");
					s.push(op1);
					break;
				}
				case '~': {
					char op1[10] ;
					strcpy(op1,"(");
					strcat(op1,"~");
					strcat(op1,s.pop());
					strcat(op1,")");
					s.push(op1);
					break;
				}
			}
		}
	}
	cout << "Infix form: " << s.pop();
}



