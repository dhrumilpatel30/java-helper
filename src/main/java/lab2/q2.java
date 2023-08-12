package lab2;

import java.util.Scanner;
public class q2 {
    public static Scanner sc;
    /**
     * This program checks if a given string is a palindrome or not.
     * A string is a palindrome if it reads the same backward as forward.
     * The program prompts the user to enter a string and then checks if it is a palindrome or not.
     * If the string is a palindrome, it prints "is palindrome", otherwise it prints "not a palindrome".
     * The program assumes that the input string contains only alphabets and no special characters or spaces.
     * 
     */
    public static void main(String[] args) {
        System.out.println("Enter String:");
        sc = new Scanner(System.in);
        String inputString= sc.nextLine();
        String status="is pallidrome";
        int half_length;
        if(inputString.length()%2 == 0){
            half_length=inputString.length()/2;
        }
        else{
            half_length=(inputString.length()+1)/2;
        }
        for(int i=0;i<half_length;i++){
            if(inputString.charAt(i)!=inputString.charAt(inputString.length()-i -1)){
                status="not a pallidrome";
            }

        }
        
        System.out.println("The Strings is "+status);
    }
}
