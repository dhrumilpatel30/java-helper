package lab1;
import java.util.Scanner;
public class q3 {
    /**
     * This program takes an integer input from the user and prints all the numbers from 1 to the input number that are multiples of 3 or 5.
     * It uses a for loop to iterate through the numbers and checks if each number is divisible by 3 or 5 using the modulo operator.
     * If a number is divisible by 3 or 5, it is printed to the console.
     */
    public static void main(String[] args){
        System.out.println("Enter Number:");
        Scanner sc=new Scanner(System.in);
        int number_input= sc.nextInt();
        for(int i=1;i<number_input;i++){
            if(i%3 == 0 || i%5 == 0){
                System.out.println(i);
            }
        }
    }
}
