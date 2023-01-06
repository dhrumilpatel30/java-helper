package lab3.q1;
import java.util.Scanner;
public class q1_numberuse {
    public static void main(final String[] args) {
        int input =  new Scanner(System.in).nextInt();
        final NumberClass nc1 = new NumberClass(input);
        System.out.println("The given number is prime: "+nc1.isPrimeNumber());
    }

}
