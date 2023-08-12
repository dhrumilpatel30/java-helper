package lab2;
import java.util.Scanner;
public class q3 {
    public static Scanner sc;
    public static void main(String[] args) {
        System.out.println("Enter String:");
        sc = new Scanner(System.in);
        String inputString= sc.nextLine();
        char a=(inputString.charAt(0));
        String abbravation_generated;
        abbravation_generated=String.valueOf(a);
        abbravation_generated=abbravation_generated.concat(".");
        int positon=0,inx=0;
        for(int i=1;i<inputString.length() && positon != 2;i++){

            if(' ' == inputString.charAt(i) && positon==1){
                inx=i+1;
                positon=2;
            }
            if(' ' == inputString.charAt(i) && positon==0){
                abbravation_generated=abbravation_generated.concat(String.valueOf(inputString.charAt(i+1)));

                abbravation_generated=abbravation_generated.concat(".");
                positon=1;
            }
        }
        System.out.print(abbravation_generated);
        for(int i=inx;i<inputString.length();i++){
            System.out.print(inputString.charAt(i));
        }
        System.out.print('\n');
    }
}
