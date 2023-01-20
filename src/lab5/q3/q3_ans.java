package lab5.q3;

public class q3_ans {
    public static void main(String[] args) {
		Queue1 q1 =  new Queue1();

		System.out.println("Queue with overflow and underflow protection...");

		new Producer(q1);
		new Consumer(q1);

	}
}
