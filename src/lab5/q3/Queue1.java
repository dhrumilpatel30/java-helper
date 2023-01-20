package lab5.q3;

public class Queue1 {
    boolean is_empty = false;
	int buffer;
	synchronized public void enqueue(int element) {
		while(is_empty) {
			try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException caught");
            }
		}
		buffer = element;
		is_empty = true;
		notify();

	}
	synchronized public int dequeue1() {
		while(!is_empty) {
			try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException caught");
            }
		}
		is_empty = false;
		notify();
		return buffer;
	}
}
