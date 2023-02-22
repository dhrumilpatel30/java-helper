package lab2;
import java.util.Scanner;
public class q4_removeshitespace {
    public static Scanner sc;
    public static void main(String[] args) {
        System.out.println("Enter String:");
        sc = new Scanner(System.in);
        String inputString= sc.nextLine();
        String abbravation_generated="";
        for(int i=0;i<inputString.length();i++){
            if(' ' == inputString.charAt(i) || '\t' ==
                    inputString.charAt(i)){
            }
            else{
                abbravation_generated=abbravation_generated.concat(String.valueOf(inputString.charAt(i)));
            }
        }
        System.out.print(abbravation_generated);
        System.out.print('\n');
    }
}
