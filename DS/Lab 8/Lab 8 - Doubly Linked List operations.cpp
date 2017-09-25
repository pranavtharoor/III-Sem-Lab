#include <iostream>

using namespace std;

class node {
    int data ;
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
    node* insert_before_element(node *start) {
        node *temp = new node;
        temp -> next = NULL;
        temp -> prev = NULL;
        cout << "Enter data: ";
        cin >> temp -> data;
        if(start == NULL) return temp;
        cout << "Enter element to insert before: ";
        int e;
        cin >> e;
        node *t = start;
        while(t -> next != NULL) {
            if(t -> next -> data == e) break;
            t = t -> next;
        }
        temp -> next = t -> next;
        temp -> prev = t;
        t -> next = temp;
        temp -> next -> prev = temp;
        return start;
    }
/*    node* insert_after_element(node *start) {
        node *temp = new node;
        temp -> next = NULL;
        temp -> prev = NULL;
        cout << "Enter data: ";
        cin >> temp -> data;
        if(start == NULL) return temp;
        cout << "Enter element to insert after: ";
        int e;
        cin >> e;
        node *t = start;
        t -> next = NULL;
        t -> prev = NULL;
        while(t -> next != NULL) {
            if(t -> data == e) break;
            t = t -> next;
        }
        temp -> next = t -> next;
        temp -> prev = t;
        t -> next = temp;
        if(temp -> next != NULL)
            temp -> next -> prev = temp;
        return start;
    }*/
};

int main() {
    node* start = NULL;
    node dl;
    cout << "Choose\n1: Insert element at end\n2: Insert element before another element\
    \n3: Insert element after another element\n4: Delete a given element\n5: Reverse list\
    \n6: Display list\n7: Quit";
    int o;
    cin >> o;
    while(o != 7) {
        switch(o) {
        case 1:
            start = dl.insert_end(start);
            break;
        case 2:
            start = dl.insert_before_element(start);
            break;
        case 3:
            //start = dl.insert_after_element(start);
            break;
        case 4:
            //start = dl.delete_element(start);
            break;
        case 5:
            //start = dl.reverse_list(start);
            break;
        case 6:
            dl.display(start);
            break;
        case 7:
            return 0;
            break;
        default:
            cout << "Invalid";
        }
        cout << "Choose option: ";
        cin >> o;
    }
    return 0;
}




