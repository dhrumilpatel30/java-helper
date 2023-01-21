package lab5.q4;


class A{

    synchronized void methodofA(B b){

    }
    synchronized void isAacquired(){
        System.out.println("Lock for A is acquired...");
    }
}
class B{
    synchronized void methodofB(A a){

    }
    synchronized void isBacquired(){
        System.out.println("Lock for B is acquired...");
    }
}
public class Deadlock implements Runnable{
    public A a;
    public B b;

    @Override
    public void run() {

    }
}
