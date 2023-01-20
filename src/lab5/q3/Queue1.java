package lab5.q3;

public class Queue1 {
    int length,index;
	int[] queue;

	public Queue1(int sizeofqueue) {
		length=sizeofqueue;
		queue = new int[sizeofqueue];
		index=0;
	}
	boolean isFull() {
		return length == index;
	}
	boolean isEmpty() {
		return 0 == index;
	}
	synchronized public void enqueue(int element) {

		while(isFull()) {
			try {
				Thread.sleep(2000);
                wait();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException caught");
            }
		}
		notify();
		queue[index]=element;
		index+=1;

	}
	synchronized public int dequeue1() {
		while(isEmpty()) {
			try {
				Thread.sleep(2000);
                wait();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException caught");
            }
		}
		notify();
		index-=1;
		return queue[index];

	}
}
