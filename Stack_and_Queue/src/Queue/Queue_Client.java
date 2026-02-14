package Queue;

public class Queue_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue_Implement q=new Queue_Implement();
		System.out.println(q.isEmpty());
		
		 q.enqueue(1);
	     q.enqueue(2);
	     q.enqueue(3);
	     q.enqueue(4);

	     System.out.println(q.size());
	        
	     System.out.println(q.dequeue());
	        
	     System.out.println(q.size());
	     //size ka issue use circular queue
		q.enqueue(10);
        q.enqueue(20);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        q.enqueue(30);
        System.out.println(q.size);
        q.enqueue(40);
        q.enqueue(50);

        System.out.println(q.peek());
        q.display();

	}

}
