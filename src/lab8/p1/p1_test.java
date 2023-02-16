package lab8.p1;

public class p1_test {
    public static void main(String[] args) {
        Queue<Integer> q1= new Queue<>(20);
        q1.enqueue(1);
        q1.enqueue(2);
        q1.enqueue(3);
        q1.display();
        System.out.println(q1.dequeue());
        q1.enqueue(4);
        q1.display();
        System.out.println(q1.dequeue());
    }
}
