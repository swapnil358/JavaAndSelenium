package TestPackage;

import sun.applet.Main;

public class stackImp {

	int size;
	int top;
	int arr[];

	public stackImp(int size) {
		this.size = size;
		this.arr = new int[size];
		this.top = -1;
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (size - 1 == top);
	}

	public int peek() {
		if (!this.isEmpty()) {
			return arr[top];

		} else {
			System.out.println("Stack is empty");
			return -1;
		}
	}

	public void push(int element) {
		if (!this.isFull()) {
			top++;
			arr[top] = element;
			System.out.println("Pushed element is:" + element);
		} else {
			System.out.println("Stack is full");
		}

	}
	
	public int pop() {
		if(!this.isEmpty()) {
			top--;
			int returnedTop = top;
			System.out.println("popped element is:" + arr[returnedTop]);
			return arr[returnedTop];
		}else {
			System.out.println("stack is empty");
			return -1;
		}
	}
	
	
	public static void main(String[] args) {
		
		stackImp st = new stackImp(10);
		st.pop();
		
		st.push(100);
		st.push(200);
		st.push(300);
		st.push(400);
		st.push(500);
		st.push(600);
		st.push(700);
		st.push(800);
		st.push(900);
		st.push(1000);
		
		
		st.pop();
		
		st.peek();
		
		
		
		
		
	}

}
