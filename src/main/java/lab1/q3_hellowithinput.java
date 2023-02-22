package lab1;
import java.util.Scanner;
public class q3_hellowithinput {
        public static void main(String[] args) {
            System.out.println("Enter Username:");
            Scanner sc = new Scanner(System.in);
            String inp = sc.nextLine();
            System.out.println("Hello " + inp);
        }
}
