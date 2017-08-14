#include <iostream.h>
#include <conio.h>

#define max 10

class cirqueue {
	int f, r;
	int q[max];
	int l;
	public:
		cirqueue() {
			f = 0;
			r = 0;
			l = 0;
		}
		void enqueue(int a) {
			if(l != max) {
				l++;
				q[++r % max] = a;
			} else {
				cout << "Queue full\n";
			}
		}
		int dequeue() {
			if(l > 0) {
				l--;
				return q[++f % max];
			}
			return -1;
		}
};

void main() {
	clrscr();
	cirqueue q;
	char t = 'y';
	int n, z, w;
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
				w = q.dequeue();
				if(w == -1) cout << "Queue empty\n";
				else cout << w << "\n";
				break;
			default:
				cout << "Invalid\n";
		}
		cout << "Continue? (y/n): ";
		cin >> t;
	}
}