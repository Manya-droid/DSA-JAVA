package Queue;

public class Circular_Queue_Client {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circular_Queue cq=new Circular_Queue();
		cq.enqueue(10);
        cq.enqueue(20);
        System.out.println(cq.dequeue());
        System.out.println(cq.dequeue());
        //size after dequeue is 0
        System.out.println(cq.size);
        cq.enqueue(30);
        //size = 1
        System.out.println(cq.size);
        cq.enqueue(40);
        cq.enqueue(50);
        //size = 3
        System.out.println(cq.size);
        // Front = 30
        System.out.println(cq.getFront());
        //display
        cq.display();

	}

	
	

}
