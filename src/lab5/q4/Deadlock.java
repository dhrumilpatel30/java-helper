package lab5.q4;


class A implements Runnable{
    static B b;
    public static void getreference(B b1) {
        b=b1;
    }
    synchronized void methodofA(B b){
        System.out.println("Inside method of A by "+Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("A Interrupted");
        }
        System.out.println("Try to get lock on B by "+Thread.currentThread().getName());
        b.isB_acquired();
    }
    synchronized void isA_acquired(){
        System.out.println("Lock for A is acquired...");
    }

    @Override
    public void run() {
        methodofA(b);
    }
}
class B implements Runnable{
    static A a;
    public static void getreference(A a1) {
        a=a1;
    }
    synchronized void methodofB(A a){
        System.out.println("Inside method of B by "+Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("B Interrupted");
        }
        System.out.println("Try to get lock on A by "+Thread.currentThread().getName());
        a.isA_acquired();
    }
    synchronized void isB_acquired(){
        System.out.println("Lock for B is acquired...");
    }
    public void run() {
        methodofB(a);
    }

}
public class Deadlock{
    public A a = new A();
    public B b = new B();

    public Deadlock(){
        Thread.currentThread().setName("MainThread");
        Thread t1 = new Thread(a, "Thread which has A and wants B");
        t1.start();
        A.getreference(b);
        Thread t2 = new Thread(b, "Thread which has B and wants A");
        t2.start();
        B.getreference(a);
    }
}
