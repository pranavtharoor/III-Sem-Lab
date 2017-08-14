#include <iostream.h>
#include <conio.h>

#define max 3

class cirqueue {
	int f, r;
	int q[max];
	public:
		cirqueue() {
			f = 0;
			r = 0;
		}
		void enqueue(int a) {
			if(f % max <= r % max)
				q[++r % max] = a;
			cout << f << r;
		}
		int dequeue() {
			if(f % max != r % max)
				return q[++f % max];
			cout << f << r;
			return -1;
		}
};

void main() {
	clrscr();
	cirqueue q;
	char t = 'y';
	int n, z;
	while(t != 'n') {
		cout << "\n1: Enqueue\n2: Dequeue\n";
		cin >> n;
		switch(n) {
			case 1:
				cout << "Enter number: ";
				cin >> z;
				q.enqueue(z);
				break;
			case 2:
				cout << q.dequeue() << "\n";
				break;
			default:
				cout << "Invalid\n";
		}
		cout << "Continue? (y/n): ";
		cin >> t;
	}
}