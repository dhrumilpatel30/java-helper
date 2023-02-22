package lab5.q3;

public class Producer implements Runnable{
    Queue1 q1;

	public Producer(Queue1 rough) {
		this.q1=rough;
		new Thread(this, "Producer").start();
	}
	@Override
	public void run() {
		int i = 0;
		while (i<10) {
            q1.enqueue(i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
			System.out.println("Pushed number"+i++);
        }
	}
}
