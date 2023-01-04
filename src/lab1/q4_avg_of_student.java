package lab1;
import java.util.Scanner;
public class q4_avg_of_student {
    public static void main(String[] args){
        System.out.println("Enter Deatils:");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Name:");
        String name= sc.nextLine();
        System.out.print("Enter Roll No:");
        int rono= sc.nextInt();
        System.out.println("Enter Marks:");
        int avg = 0;
        avg+=sc.nextInt();
        avg+=sc.nextInt();
        avg+=sc.nextInt();
        avg+=sc.nextInt();
        avg+=sc.nextInt();
        avg/=5;
        char a[]={'A','B','C','D','E'};
        char grade = a[(100-avg)/20];

        System.out.println("Name: " + name);
        System.out.println("Roll No. :" + rono);
        System.out.println("Average: " + avg);
        System.out.println("Grade: " + grade);
    }
}
