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
    void display(node *start) {
        node *t = start;
        while(t != NULL) {
            cout << t -> data << " ";
            t = t -> next;
        }
        cout << "\n";
    }
    node* delAlt(node *start) {
        if(start -> next == NULL)
            return start;
        node *prev = start;
        node *node = start -> next;
        while(prev != NULL && node != NULL) {
            prev -> next = node -> next;
            delete node;
            prev = prev -> next;
            if(prev != NULL)
                node = prev -> next;
        }
        return start;
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
    start = l.delAlt(start);
    l.display(start);
    return 0;
}
