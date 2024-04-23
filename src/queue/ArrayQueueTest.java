package queue;

public class ArrayQueueTest {

	public static void main(String[] args) {
		
	ArrayQueue queue = new ArrayQueue(5);

	queue.queueEnqueue(2);
	queue.queueEnqueue(7);
	queue.queueDequeue();
	queue.queueDisplay();
	queue.queueFront();
	
		

	}

}
