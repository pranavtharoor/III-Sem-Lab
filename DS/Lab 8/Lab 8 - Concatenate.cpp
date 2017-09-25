#include <iostream>

using namespace std;

class node {
    int data;
    node *next, *prev;
    public:
    node* insert_end(node *start) {
        node *temp = new node;
        temp -> next = NULL;
        temp -> prev = NULL;
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
        temp -> prev = t;
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
    void concat(node* start1, node* start2) {
        node *t;
        for(t = start1; t -> next != NULL; t = t -> next);
        t -> next = start2;
        start2 -> prev = t;
    }
};

int main() {
    node *start1 = NULL, *start2 = NULL;
    node l;
    cout << "Enter length of list one: ";
    int len1;
    cin >> len1;
    cout << "Enter length of list two: ";
    int len2;
    cin >> len2;
    cout << "\nEnter list 1: ";
    for(int i = 0; i < len1; i++)
        start1 = l.insert_end(start1);
    cout << "\nEnter list 2:";
    for(int i = 0; i < len2; i++)
        start2 = l.insert_end(start2);
    l.concat(start1, start2);
    l.display(start1);
    return 0;
}







