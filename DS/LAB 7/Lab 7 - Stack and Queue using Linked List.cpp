#include <iostream>

using namespace std;

class Stack {
    int data;
    Stack *next;
    public:
    Stack* push(Stack *start) {
        Stack *temp = new Stack;
        temp -> next = NULL;
        cout << "\nEnter data: ";
        cin >> temp -> data;
        if(start == NULL) {
            start = temp;
            return start;
        }
        Stack *t = start;
        while(t -> next != NULL)
            t = t -> next;
        t -> next = temp;
        return start;
    }
    void display(Stack *start) {
        Stack *t = start;
        while(t != NULL) {
            cout << t -> data << " ";
            t = t -> next;
        }
        cout << "\n";
    }
    Stack* pop(Stack* start) {
        Stack *t = start;
        if(t -> next == NULL) {
            cout << t -> data;
            delete start;
            return NULL;
        }
        for(t; t -> next -> next != NULL; t = t -> next);
        cout << t -> next -> data;
        delete t -> next;
        t -> next = NULL;
        return start;
    }
};


class Queue {
    int data;
    Queue *next;
    public:
    Queue* enqueue(Queue *start) {
        Queue *temp = new Queue;
        temp -> next = NULL;
        cout << "\nEnter data: ";
        cin >> temp -> data;
        if(start == NULL) {
            start = temp;
            return start;
        }
        Queue *t = start;
        while(t -> next != NULL)
            t = t -> next;
        t -> next = temp;
        return start;
    }
    void display(Queue *start) {
        Queue *t = start;
        while(t != NULL) {
            cout << t -> data << " ";
            t = t -> next;
        }
        cout << "\n";
    }
    Queue* dequeue(Queue* start) {
        Queue *t = start;
        if(t -> next == NULL) {
            cout << t -> data;
            delete start;
            return NULL;
        }
        cout << start -> data;
        start = t -> next;
        return start;
    }
};

int main() {
    char t = 'y';
    int o;
    cout << "Choose\n1: Stack\n2: Queue";
    int c;
    cin >> c;
    if(c == 1) {
        Stack *start = NULL;
        Stack l;
        do {
            cout << "\nChoose option\n1: Push\n2: Pop\n3: Display\n";
            cin >> o;
            switch(o) {
                case 1:
                    start = l.push(start);
                    break;
                case 2:
                    start = l.pop(start);
                    break;
                case 3:
                    l.display(start);
                    break;
            }
            cout << "\nContinue? (y/n)";
            cin >> t;
        } while(t != 'n');
    } else {
        Queue *start = NULL;
        Queue l;
        do {
            cout << "\nChoose option\n1: Enqueue\n2: Dequeue\n3: Display\n";
            cin >> o;
            switch(o) {
                case 1:
                    start = l.enqueue(start);
                    break;
                case 2:
                    start = l.dequeue(start);
                    break;
                case 3:
                    l.display(start);
                    break;
            }
            cout << "\nContinue? (y/n)";
            cin >> t;
        } while(t != 'n');
    }
    return 0;
}

