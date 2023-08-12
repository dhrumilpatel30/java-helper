package lab2;

import java.util.Scanner;
public class q2 {
    public static Scanner sc;
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
