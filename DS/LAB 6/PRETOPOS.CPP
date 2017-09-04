#include <iostream.h>
#include <string.h>
#include <stdio.h>
#include <conio.h>


class prein

{ char stack[80][80],op1[10],op2[10],res[80],infix[80];
  char sym[2];
  int top;

  public:

  void pretoin(char a[])

   {
     strrev(a);
     for(int i=0; a[i]!='\0' ;i++)

       {
	 sym[0]=a[i];
	 sym[1]='\0';
	 if(sym[0]=='+'||sym[0]=='-'||sym[0]=='*'||sym[0]=='/'||sym[0]=='^')
	 { strcpy(op2,pop());
	   strcpy(op1,pop());
	   strcpy(res,")");
	   strcat(res,op1);
	   strcat(res,sym);
	   strcat(res,op2);
	   strcat(res,"(");
	   push(res);}
	  else
	   push(sym);
       }

     strcpy(infix,pop());
     strrev(infix);

    }

     void getstring()
	 {
	   Stack t;
	   char e1,e2;
	   char pfix[20];
	   int precedence,p=0;
	   int n=strlen(infix);
	   for(int i=0; i<n; i++)
	   {
		e1=infix[i];
		switch(e1)
	   {
		case '(':
		     {
			t.push(e1);
			break;
		     }
		case ')':
		     {
		while((e2 = t.pop())!='(')
		  pfix[p++] = e2;
		break;
		      }
	case '+':
	case '-':
	case '*':
	case '/':
	    {
		if(!t.isempty())
		{
		    precedence = prec(e1);
		    e2 = t.pop();
		    while(precedence <= prec(e2))
		    {
			pfix[p++]=e2;
			if(!t.isempty())
			    e2 = t.pop();
			else
			    break;
		    }
		    if (precedence>prec(e2))
			t.push(e2);
		}
		t.push(e1);
		break;
	    }
	default:
	    {
		pfix[p++]=e1;
		break;
	    }
	}
    }
    while(!t.isempty())
	pfix[p++]=t.pop();
    pfix[p]='\0';
    cout<<"Postfix expression: "<<pfix<<endl;
 }

    pretoin()
    {
	top=-1;
    }
    char* pop()
    {
	return stack[top--];
    }
    void push(char x[])
    {
       strcpy(stack[++top],x);

    }
  };


int prec(char sym)
{
    switch(sym)
    {
    case '/':
    case '*':
	return 3;
    case '+':
    case '-':
	return 2;
    case '(':
	return 0;
    default:
	return -1;
    }
}
class Stack
{
    int top;
    char a[10];
public:
    Stack()
    {
	top=-1;
    }
    int pop()
    {
	return a[top--];
    }
    void push(char x)
    {
	a[++top]=x;
    }
    int isempty()
    {
	if(top==-1)
	    return 1;
	return 0;
    }
};
void main()
{
    clrscr();
    prein k;
    char s[80];
    cout<<"Enter prefix expression"<<endl;
    cin>>s;
    k.pretoin(s);
    k.getstring();
    getch();
}
