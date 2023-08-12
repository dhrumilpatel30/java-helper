package lab2;

import java.util.Scanner;
public class q1 {
    public static Scanner sc;
    /**
     * This program takes user input as a string and counts the number of times the substring "hi" appears in the input string.
     * It then prints the length of the input string and the count of "hi" substrings.
     */
    public static void main(String[] args) {
        System.out.println("Enter Username:");
        sc = new Scanner(System.in);
        String inputString= sc.nextLine();
        System.out.println(inputString.length());
        int rn = 0,substrings=0;
        for(int i=0;i<inputString.length();i++){
            if(rn==0){
                if('h'==inputString.charAt(i)){
                    rn=1;
                }
            }
            if(rn==1){
                if('i'==inputString.charAt(i)){
                    rn=0;
                    substrings++;
                }
                else if ('h' !=inputString.charAt(i)){
                    rn=0;
                }
            }
        }
        

        System.out.println(substrings);
    }
}

