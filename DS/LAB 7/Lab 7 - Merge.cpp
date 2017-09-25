#include <iostream>

using namespace std;

class node {
    int data;
    node* next;
    public:
    void display(node *start) {
        node *t = start;
        while(t != NULL) {
            cout << t -> data << " ";
            t = t -> next;
        }
        cout << "\n";
    }
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
    node* merge(node *l1, node *l2) {
        node *last, *head;
        if(l1 == NULL && l2 ==NULL) return NULL;
        if(l1 == NULL) return l2;
        if(l2 == NULL) return l1;
        if(l1 -> data < l2 -> data) {
            last = l1;
            head = last;
            l1 = l1 -> next;
        } else {
            last = l2;
            head = last;
            l2 = l2 -> next;
        }
        while(l1 != NULL && l2 != NULL) {
            if(l1 -> data < l2 -> data) {
                last -> next = l1;
                last = l1;
                l1 = l1 -> next;
            } else {
                last -> next = l2;
                last = l2;
                l2 = l2 -> next;
            }
        }
        if(l1 == NULL)
            last -> next = l2;
        else
            last -> next = l1;
        return head;
    }
};

int main() {
    node *start1 = NULL, *start2 = NULL, *start3 = NULL;
    node l;
    cout << "Enter number of elements in list one: ";
    int len1;
    cin >> len1;
    cout << "Enter number of elements in list two: ";
    int len2;
    cin >> len2;
    cout << "\nList one: ";
    for(int i = 0; i , i < len1; i++)
        start1 = l.insert_end(start1);
    cout << "\nList two: ";
    for(int i = 0; i < len2; i++)
        start2 = l.insert_end(start2);
    start3 = l.merge(start1, start2);
    l.display(start3);
    return 0;
}





