/**
 * The q2 class prompts the user to enter a username and then greets the user by name.
 * The user input is read using the Scanner class from the java.util package.
 */
package lab1;
import java.util.Scanner;
public class q2{
        public static void main(String[] args) {
            System.out.println("Enter Username:");
            Scanner sc = new Scanner(System.in);
            String inp = sc.nextLine();
            System.out.println("Hello " + inp);
        }
}
