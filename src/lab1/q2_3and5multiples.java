package lab1;
import java.util.Scanner;
public class q2_3and5multiples {
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
