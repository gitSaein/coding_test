package function.stackAndQue;

public class StackFunc {

	private int top;
	private int maxSize;
	private char[] sArr;
	
	public StackFunc(int max) {
		this.top = -1;
		this.maxSize = max;
		this.sArr = new char[max];
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public boolean isFull() {
		return (top == maxSize-1); 
	}
	
	public void push(char inStr) {
		
		if(this.isFull() && !this.isEmpty()) {
			System.out.println("Stack is Full.");
			return;
		}else {
			System.out.println("Start push in stack.");
			++top;
		    sArr[top]=inStr;
		    System.out.println("[top]: " + top + "=" + sArr[top]);
		}
	}
	
	public char pop() {
		if(this.isEmpty()) {
			System.out.println("Stack is Empty.");
			return '0';
		}else {
			System.out.println("Start pop in stack.");
			top--;
			System.out.println("[top]: " + top + "=" + sArr[top]);
			return sArr[top];
		}
	}
	
	public char peek() {
		return sArr[top];
	}
	
}
