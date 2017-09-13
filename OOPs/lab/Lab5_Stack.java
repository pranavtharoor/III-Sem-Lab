class Stack {
	int top, max;
	int s[];
	public Stack(int max) {
		top = -1;
		this.max = max;
		s = new int[max];
	}
	public boolean isFull() {
		if(top == max - 1) return true;
		return false;
	}
	public boolean isEmpty() {
		if(top == -1) return true;
		return false;
	}
	public void push(int x) {
		if(!isFull()) s[++top] = x;
	}
	public int pop() {
		if(!isEmpty()) return s[top--];
		return -1;
	}
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