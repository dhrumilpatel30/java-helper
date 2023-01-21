package lab5.q4;


class A implements Runnable{

    synchronized void methodofA(B b){
        System.out.println("Inside method of A by thread name"+Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("A Interrupted");
        }
        System.out.println("Try to get lock on B by thread name"+Thread.currentThread().getName());
        b.isBacquired();
    }
    synchronized void isAacquired(){
        System.out.println("Lock for A is acquired...");
    }

    @Override
    public void run() {

    }
}
class B implements Runnable{
    synchronized void methodofB(A a){
        System.out.println("Inside method of B by thread name"+Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("B Interrupted");
        }
        System.out.println("Try to get lock on A by thread name"+Thread.currentThread().getName());
        a.isAacquired();
    }
    synchronized void isBacquired(){
        System.out.println("Lock for B is acquired...");
    }

}
public class Deadlock{
    public A a = new A();
    public B b = new B();

    public Deadlock(){
        Thread.currentThread().setName("MainThread");
        Thread t1 = new Thread(a, "Thread which has A and wants B");
        t1.start();
        Thread t2 = new Thread(b, "Thread which has B and wants A");
    }b.methodofB(a);
        System.out.println("Back in other thread");
    }
}
