#include <iostream>

using namespace std;

class node {
    int data;
    node *next;
    public:
    node* insert_end(node *start, int x) {
        node *temp = new node;
        temp -> next = NULL;
        temp -> data = x;
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
    node* delAlt(node *start) {
        for(node *t = start; t -> next -> next != NULL; t = t -> next) {
            t -> next = t -> next -> next;
        }
        //if(t -> next )************************************************************************************************
        return start;
    }
};

int main() {
    node *start = NULL;
    node l;
    start = l.insert_end(start, 2);start = l.insert_end(start, 1);start = l.insert_end(start, 2);start = l.insert_end(start, 1);start = l.insert_end(start, 2);start = l.insert_end(start, 1);start = l.insert_end(start, 2);start = l.insert_end(start, 1);
    start = l.delAlt(start);
    l.display(start);
    return 0;
}
