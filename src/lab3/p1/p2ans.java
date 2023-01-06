package lab3.p1;
import java.util.*;
public class p2ans {
    public static void main(String[] args) {
        Employee[] st=new Employee[3];
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
            st[i]=new Employee(rol,marks,age,name);
        }
        st[idex].displayDetails();
        Employee st1=new Employee();
        System.out.println("The Number of Students Created="+Employee.getCount());
    }

}
