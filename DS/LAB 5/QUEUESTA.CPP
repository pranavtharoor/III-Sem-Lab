#include <iostream.h>
#include <conio.h>

class stackqueue {
	int st1[80], st2[80];
	int top1, top2, count;

	public:

	void push1(int ele) {
		st1[++top1]=ele;
	}
	void push2(int ele) {
		st2[++top2]=ele;
	}
	int pop1() {
	   return st1[top1--];
	}
	int pop2() {
		return st2[top2--];
	} 
	void display() {
		if(top1<0)
	   		cout<<"Empty"<<endl;
	  	else {
	  		for(int i=0;i<=top1;i++) {
	  			cout<<st1[i]<<" ";
	  		}
	  		cout<<endl;
	  	}
	}

	stackqueue() {
	   top1 =-1;
	   top2 =-1;
	   count=0;
	 }

	void insert(int x) {
		push1(x);
		count++;
	}

	void del() {
		for(int i=0;i<=count;i++) {
			push2(pop1()); 
		}
		pop2();
		count--;
		for(int j=0;j<=count;j++)
			push1(pop2());
	}
};

void main() {
	clrscr();
 	stackqueue q; int n; int ele,m=0;
 	char ch;
	do {
		cout<<"1.Insert\n2.Delete\n3.Display\n4.Exit "<<endl;
		cin>>n;
		switch(n)  {
			case 1: cout<<"Enter element: "<<endl;
		   		cin>>ele;
		   		q.insert(ele);
		   		break;
		    case 2: q.del();
    		    break;
	   		case 3: q.display();
			    break;
	   		case 4: m=1;
		   		break;
	   		default: cout<<"Invalid"<<endl;
	 }

	if(m==1) break;
	cout<<"\nContinue? (y/n)"<<endl;
	cin>>ch;
	} while(ch=='y');
	getch();
}