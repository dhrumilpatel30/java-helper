package lab5.q3;

public class Consumer implements Runnable{
    Queue1 q1;

	public Consumer(Queue1 rough) {
		this.q1=rough;
		new Thread(this, "Consumer").start();
	}
	@Override
	public void run() {
		while(true) {
			System.out.println("poped "+q1.dequeue1());
		}
	}

}
