package lab;

// Implementation of stack using arrays

class Stack {
	int top, max;
	int s[];
        
        // Initializes top of stack and max value
	public Stack(int max) {
		top = -1;
		this.max = max;
		s = new int[max];
	}
        
        // Checks if the stack is full
	public boolean isFull() {
		if(top == max - 1) return true;
		return false;
	}
        
        // Checks if the stack is empty
	public boolean isEmpty() {
		if(top == -1) return true;
		return false;
	}
        
        // Pushes element to top of the stack
	public void push(int x) {
		if(!isFull()) s[++top] = x;
	}
        
        // Pops element from the top of te stack
	public int pop() {
		if(!isEmpty()) return s[top--];
		return -1;
	}
        
        // Returns the top most element in the stack 
	public int peek() {
		if(!isEmpty()) return s[top];
		return -1;
	}
}

public class Lab5_Stack {
	public static void main(String args[]) {
		Stack s = new Stack(20);
		s.push(2);
		s.push(3);
		s.push(4);
		System.out.println(s.pop());
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.pop());
	}
}