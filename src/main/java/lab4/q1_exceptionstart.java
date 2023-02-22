package lab4;

public class q1_exceptionstart {
    public static void main(String[] args) {
        // int i = sc.nextInt();
        int a = 50, b = 1, c = 100;
        try {
            b = c / a;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println(b+" "+c);
        }
        System.out.println(b+" "+c);
        a = 0;
        try {
            b = c / a;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println(b+" "+c);
        }
    }
}
