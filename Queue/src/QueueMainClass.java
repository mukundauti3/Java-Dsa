
public class QueueMainClass {

	public static void main(String[] args) {
		QueueList queue = new QueueList();
        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        // Output: Queue (Front → Rear): 10 20 30
        queue.deQueue(); // Output: Dequeued: 10
       // Output: Queue (Front → Rear): 20 30
 
	}

}
