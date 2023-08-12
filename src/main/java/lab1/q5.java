package lab1;
import java.util.Scanner;
import java.lang.*;
public class q5 {
    public static int calculateSumOfEvenNumbers(int[] arro){
        int total=0;

        for(int a:arro){
            if(a%2 == 0){
                total+=a;
            }
        }
        return total;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers(in one line):");
        String str="";
        while (true) {
            try {
                str = scanner.nextLine();
            } finally {
                break;
            }
        }
        String[] string = str.split(" ");
        int[] arr = new int[string.length];
        for (int i = 0; i < string.length; i++) {
            arr[i] = Integer.valueOf(string[i]);
        }
        System.out.println("Sum of Even Numbers:" + calculateSumOfEvenNumbers(arr));
    }
}
