#include <iostream>

using namespace std;

class node {
	int data;
	node* next;
public:
	node* insert_sorted(node *start) {
		node *temp = new node;
		cout << "Enter data: ";
		cin >> temp -> data;
		if(start == NULL) return temp;
		node *t = start;
		if(start -> data > temp -> data) {
			temp -> next = start;
			return temp;
		}
		while(t -> next != NULL) {
			if(t -> next -> data < temp -> data)
				t = t -> next;
			else break;
		}
		temp -> next = t -> next;
		t -> next = temp;
		return start;
	}
	void display(node *start) {
		node *t = start;
		while(t != NULL) {
			cout << t -> data << " ";
			t = t -> next;
		}
		cout << "\n";
	}
};

int main() {
	node *start = NULL;
	node l;
	for(int i = 0; i < 5; i++)
		start = l.insert_sorted(start);
	l.display(start);
	return 0;
}