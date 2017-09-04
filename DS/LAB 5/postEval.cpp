#include <iostream>
#include <stdio.h>
#include <string.h>
#include <ctype.h>

using namespace std;

class stack {
    int top;
    int s[10];
    public:
    stack() {
        top = -1;
    }
    void push(int a) {
        s[++top] = a;
    }
    int pop() {
        return s[top--];
    }
};
int main() {
    stack s;
    char exp[20];
    cout<<"Enter expression: ";
    cin >> exp;
    int l = strlen(exp);
    for(int i = 0; i < l; i++) {
        if(isdigit(exp[i])) {
            s.push((int)exp[i] - '0');
        } else {
            switch(exp[i])
            {
                case '+': {
                    int op2 = s.pop();
                    int op1 = s.pop();
                    op2 = op1 + op2;
                    s.push(op2);
                    break;
                }
                case '-': {
                    int op2 = s.pop();
                    int op1 = s.pop();
                    op2 = op1 - op2;
                    s.push(op2);
                    break;
                }
                case '*': {
                    int op2 = s.pop();
                    int op1 = s.pop();
                    op2 = op1 * op2;
                    s.push(op2);
                    break;
                }
                case '/': {
                    int op2 = s.pop();
                    int op1 = s.pop();
                    op2 = op1 / op2;
                    s.push(op2);
                    break;
                }
                case '~': {
                    int op2 = s.pop();
                    op2 = ~ op2;
                    s.push(op2);
                    break;
                }
            }
        }
    }
    cout<<"Result: " << s.pop();
    return 0;
}