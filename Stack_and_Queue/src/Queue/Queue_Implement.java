package Queue;

public class Queue_Implement {
	public int[] arr;
	public int front=0;
	public int rear=0;
	
	public int size=0;
	public static int maxsize=5;
	
	public Queue_Implement() {
		this(maxsize);
	}
	public Queue_Implement(int n) {
		arr=new int[n];
	}
	public int size() {
		return size;
	}
	public Boolean isEmpty() {
		return size==0;
	}
	public Boolean isFull() {
		return size==arr.length;
	}
	public void enqueue(int ele) {
		arr[rear]=ele;
		rear++;
		size++;
		
	}
	public int dequeue() {
		int ele=arr[front];
		front++;
		size--;
		return ele;
		
	}
	public int peek() {
		return arr[front];
	}
	
	
    public void display(){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


}
