package Queue;

public class Circular_Queue {

	public int[] arr;
	public int front=0;
	public int size=0;
	
	public Circular_Queue() {
		this(5);
	}
	public Circular_Queue(int n) {
		arr=new int[n];
	}
	public boolean isEmpty() {
		return size==0;
		
	}
	public boolean isFull() {
		return size==arr.length;
	}
	public void enqueue(int ele) {
		//comparing size as a parameter would create error of index out of bound
		//using circular queue as maxsize is five so after 4th index item will be added to the 0th index
		//so we take mod like if front is at index 2 and size of the queue is 3 and arr length is 5 so (2+3)%5 = 0;
		//next element will be added on 0th index 
		int idx=(front+size) % arr.length;
		arr[idx]=ele;
		size++;
	}
	public int dequeue() {
		int x=arr[front];
		//
		front=(front+1) % arr.length;
		size--;
		return x;
	}
	public int getFront() {
		int ele=arr[front];
		return ele;
	}
	public void display() {
		for (int i = 0; i < size; i++) {
			int idx=(front+i) % arr.length;
			System.out.print(arr[idx]+" ");
		}
		System.out.println();
	}

}
