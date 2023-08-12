package lab1;
import java.util.Scanner;
import java.lang.*;
public class q5 {
    /**
     * Calculates the sum of all even numbers in the given integer array.
     * 
     * @param arro the integer array to calculate the sum of even numbers from
     * @return the sum of all even numbers in the array
     */
    public static int calculateSumOfEvenNumbers(int[] arro){
        int total=0;

        for(int a:arro){
            if(a%2 == 0){
                total+=a;
            }
        }
        return total;
    }
    import java.util.Scanner;

    public class q5 {
        /*
         * This program reads a line of space-separated integers from the user and calculates the sum of even numbers.
         * It uses the calculateSumOfEvenNumbers method to calculate the sum of even numbers in the input array.
         * 
         */
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
}
