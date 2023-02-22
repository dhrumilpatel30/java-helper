package lab4;

public class q3_exceptionwithfinally {
    public static void main(String[] args) {
        //case A
        try{
            int data=25/5;
            System.out.println(data);
        }catch(NullPointerException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("finally block is executed no matter what happens above.");
        }
        //case B
        try{
            int data=25/0;
            System.out.println(data);
        }catch(NullPointerException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("finally block is executed no matter what happens above.");
        }
        //case C
        try{
            int data=25/0;
            System.out.println(data);
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("finally block is executed no matter what happens above.");
        }
    }
}
