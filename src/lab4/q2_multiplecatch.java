package lab4;

public class q2_multiplecatch {
    public static void main(String[] args) {
       int[] a = new int[5];
       try {
           a[5]=30/5;
       } catch (ArrayIndexOutOfBoundsException e) {
           System.out.println(e);
       }
       a[0] = 0;
       try {
           a[4]=a[3]/a[0];
       } catch (ArithmeticException e) {
           System.out.println(e);
       }
       //both together
        try {
            a[5]=a[3]/a[0];
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }catch (ArithmeticException e){
            System.out.println(e);
        }
    }
}
