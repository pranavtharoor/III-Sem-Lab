#include <iostream>

using namespace std;

class node {
    int data;
    node *next;
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
    node* insert_beginning(node *start) {
        node *temp = new node;
        cout << "\nEnter data: ";
        cin >> temp -> data;
        temp -> next = start;
        start = temp;
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
    node* insert(node *start) {
        node *temp = new node;
        temp -> next = NULL;
        cout << "\nEnter data: ";
        cin >> temp -> data;
        if(start == NULL) {
            start = temp;
            return start;
        }
        cout << "Enter position: ";
        int p;
        cin >> p;
        node *t = start;
        for(int i = 1; i < p - 1; i++) {
            t = t -> next;
        }
        temp -> next = t -> next;
        t -> next = temp;
        return start;
    }
    node* insert_before_element(node *start) {
        node *temp = new node;
        temp -> next = NULL;
        cout << "\nEnter data: ";
        cin >> temp -> data;
        if(start == NULL) {
            start = temp;
            return start;
        }
        cout << "Enter element to insert data before: ";
        int e;
        cin >> e;
        if(start -> data == e) {
            temp -> next = start -> next;
            start -> data = temp -> data;
            temp -> data = e;
            start -> next = temp;
            return start;
        }
        node *t = start;
        while(t -> next != NULL) {
            if(t -> next -> data == e) {
                temp -> next = t -> next;
                t -> next = temp;
                break;
            }
            t = t -> next;
        }
        return start;
    }
};

int main() {
    node *start = NULL;
    node l;
    char t = 'y';
    int o;
    do {
        cout << "\nChoose option\n1: Insert end\n2: Insert beginning\n3: Insert at position\
        \n4: Insert before element\n10: Display\n";
        cin >> o;
        switch(o) {
            case 1:
                start = l.insert_end(start);
                break;
            case 2:
                start = l.insert_beginning(start);
                break;
            case 3:
                start = l.insert(start);
                break;
            case 4:
                start = l.insert_before_element(start);
                break;
            case 10:
                l.display(start);
                break;
        }
        cout << "\nContinue? (y/n)";
        cin >> t;
    } while(t != 'n');
    return 0;
}
