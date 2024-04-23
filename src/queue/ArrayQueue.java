package queue;

public class ArrayQueue {
	
	private static int front;
	private static int rear;
	private static int capacity;
	private static int[] queue;
	
	public ArrayQueue(int size) {
		front = 0;
		rear = 0;
		capacity = size;
		queue = new int[size];
	}
	
	/*
	 * setzt ein Wert in die Warteschlange ein
	 */
	public void queueEnqueue(int item) {
		if(rear == capacity) {
			System.out.println("Queue ist voll.");
		}else {
			queue[rear] = item;
			rear++;
		}
	}
	
	/*
	 * entfernt ein Wert aus der Warteschlange
	 */
	public int queueDequeue() {
		int firstElement = 0;
		if(rear == front) {
			System.out.println("Queue ist leer");
		}else {
			firstElement = queue[front];
			for(int i = 0; i <(rear-1); i++) {
				queue[i] = queue[i+1];
			}
			if(rear < capacity) {
				queue[rear] = 0;
			}
			rear --;
			
		}
		return firstElement;
	}
	
	/*
	 * zeigt die Warteschlange an
	 */
	public void  queueDisplay() {
		if(front == rear) {
			System.out.println("Queue is empty!");
		}else {
			for(int i = front; i < rear; i++) {
				System.out.println(i);
			}
		}
	}
	
	/*
	 * zeigt nur den ersten Wert an
	 */
	public int queueFront() {
		// TODO erstes Element ohne L�schen zur�ckgeben
		int firstElement = 0;
		if(rear == front) {
			System.out.println("Queue is empty!");
		}else {
			firstElement = queue[front];
			
		}return firstElement;
		
	}
	
	// H�: ArrayQueueTest - alle Methoden von ArrayQueue testen
	//		JavaDoc - Kommentare
	//		Kapitel 5 nochmal durcharbeiten
	

}
