#include <iostream>

using namespace std;

class node {
    int data;
    node* next;
public:
    node* insert_end(node *start) {
        node *temp = new node;
        temp -> next = NULL;
        cout << "\nEnter data: ";
        cin >> temp -> data;
        if(start == NULL) {
            start = temp;
            return start;
        }
        node *t = start;
        while(t -> next != NULL)
            t = t -> next;
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
    node* reverse(node *start) {
        node *prev   = NULL;
        node *current = start;
        node *next;
        while (current != NULL)
        {
            next = current -> next;  
            current -> next = prev;   
            prev = current;
            current = next;
        }
        return prev;
    }
};

int main() {
    node *start = NULL;
    node l;
    cout << "Enter number of elements: ";
    int n;
    cin >> n;
    for(int i = 0; i < n; i++) {
        start = l.insert_end(start);
    }
    start = l.reverse(start);
    l.display(start);
    return 0;
}