package lab5.q3;

public class Consumer implements Runnable{
    Queue1 q1;

	public Consumer(Queue1 rough) {
		this.q1=rough;
		new Thread(this, "Consumer").start();
	}
	@Override
	public void run() {
		int i=10;
		while(i>0) {
			i--;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
			System.out.println("pop of number "+q1.dequeue1());
		}
	}

}
