package Stack;

public class Stack_Implement {
	public int[] arr;
	public int top=-1;
	public static int maxsize=5;
	
	public Stack_Implement() {
		this(maxsize);
	}
	
	public Stack_Implement(int n) {
		arr=new int[n];
	}
	
	public Boolean isEmpty() {
		return top==-1;
	}
	public int size() {
		return top+1;
	}
	
	public Boolean isFull() {
		return size()==arr.length;
	}
	
	
	public void push(int ele) throws Exception {
		if(isFull()) {
			throw new Exception("Stack is Full!");
		}
		top++;
		arr[top]=ele;
		
	}
	
	
	public int peek() throws Exception {
		if(isEmpty()) {
			throw new Exception("Stack is Still Empty!!");
		}
		return arr[top];
	}
	
	public int pop() throws Exception{
		if(isEmpty()) {
			throw new Exception("Stack is Still Empty!!");
		}
		int ele=arr[top];
		top--;
		return ele;
		
		
		
		
	}

	
	
	

}
