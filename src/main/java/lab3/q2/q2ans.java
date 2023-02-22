package lab3.q2;
import java.util.*;
public class q2ans {
    public static void main(String[] args) {
        Student[] st=new Student[3];
        double avg,maxavg=0;
        int idex=0;
        for(int i=0;i<3;i++){
            Scanner sc =new Scanner(System.in);
            System.out.print("Enter roll no of Student No."+(i+1)+": ");
            int rol= sc.nextInt();
            sc.nextLine();
            System.out.print("Enter name of Student No."+(i+1)+": ");
            String name= sc.nextLine();
            System.out.print("Enter age of Student No."+(i+1)+": ");
            int age=sc.nextInt();
            System.out.print("Enter no of subjects of Student No."+(i+1)+": ");
            int sub=sc.nextInt();
            double[] marks= new double[sub];
            avg=0;
            System.out.print("Enter marks of Student No."+(i+1)+": ");
            for(int j=0;j<sub;j++){
                marks[j]=sc.nextInt();
                avg=avg+marks[j];
            }
            avg/=sub;
            if(avg>maxavg){
                maxavg=avg;
                idex=i;
            }
            st[i]=new Student(rol,marks,age,name);
        }
        st[idex].displayDetails();
        Student st1=new Student();
        System.out.println("The Number of Students Created="+Student.getCount());
    }

}
