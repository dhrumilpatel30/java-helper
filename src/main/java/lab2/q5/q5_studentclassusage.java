package lab2.q5;
import java.util.*;
/**
 * This program takes input from the user for the number of students, their names, roll numbers and marks in 5 subjects.
 * It then calculates the average marks of each student and finds the student with the highest average marks.
 * Finally, it displays the roll number, name and average marks of the student with the highest average marks.
 * The program uses the Student class to store the information of each student.
 */
public class q5 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. of student:");
        int n = sc.nextInt();
        Student []s = new Student[n];
        for(int i=1;i<=n;i++){
            System.out.println("Enter the name of student no."+i);
            String name = sc.next();
            System.out.println("Enter the rollno of student no."+i);
            int roll = sc.nextInt();
            int []m= new int[5];
            System.out.println("Enter the marks of student no."+i);
            for(int j=0;j<5;j++){
                m[j] = sc.nextInt();
            }
            s[i-1] = new Student(roll,name,m);
        }
        int mroll=0;
        String mname="";
        int maxavg=0;
        for(int j=0;j<n;j++){
            if(s[j].findAvg() >maxavg){
                mroll = s[j].rollno;
                mname = s[j].name;
                maxavg = s[j].findAvg();
            }
        }
        System.out.println("student who has scored highest is rollno."+mroll+"\n"+"name:"+mname+"\n"+"Avgmarks:"+maxavg);
    }
}
