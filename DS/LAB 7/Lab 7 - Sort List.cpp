
#include <iostream>
#include <string.h>

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
    node* sort(node *start) {
        for(node *t = start; t -> next != NULL; t = t -> next)
            for(node *t1 = start; t1 -> next != NULL; t1 = t1 -> next)
                if(t1 -> data > t1 -> next -> data) {
                    t1 -> data ^= t1 -> next -> data;
                    t1 -> next -> data ^= t1 -> data;
                    t1 -> data ^= t1 -> next -> data;
                }
        return start;
    }
};

int toInt(char *c) {
    int x = 0;
    for(int i = 0; c[i] != '\0'; i++) {
        x *= 10;
        x += c[i] - '0';
    }
    return x;
}

int main() {
    node *start = NULL;
    node l;
    cout << "Enter elements to insert.\nq to quit\ns to sort\nd to display\n\n";
    char o[100];
    while(true) {
        cin >> o;
            if(strcmp(o, "q") == 0)
                return 0;
            else if(strcmp(o, "s") == 0)
                start = l.sort(start);
            else if(strcmp(o, "d") == 0)
                l.display(start);
            else
                start = l.insert_end(start, toInt(o));
    }
    return 0;
}
