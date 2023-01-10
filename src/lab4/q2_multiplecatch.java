package lab4;

public class q2_multiplecatch {
    public static void main(String[] args) {
       int[] a = new int[5];
       try {
           a[5]=30/5;
       } catch (Exception e) {
           System.out.println(e.getMessage());
       }
       a[0] = 0;
       try {
           a[4]=a[3]/a[0];
       } catch (Exception e) {
           System.out.println(e.getMessage());
       }
    }
}
