package lab3.p1;
import java.util.*;
public class p2ans {
    public static void main(String[] args) {
        Employee[] em=new Employee[10];
        double max_salary=0;
        int idex=0;
        for(int i=0;i<10;i++){
            Scanner sc =new Scanner(System.in);
            System.out.print("Enter id No."+(i+1)+": ");
            int rol= sc.nextInt();
            System.out.print("Enter name No."+(i+1)+": ");
            String name= sc.nextLine();
            System.out.print("Enter age No."+(i+1)+": ");
            int age=sc.nextInt();
            System.out.print("Enter Department No."+(i+1)+": ");
            String dept=sc.nextLine();
            System.out.print("Enter Gross salary No."+(i+1)+": ");
            double gs=sc.nextDouble();
            System.out.print("Enter Provident Fund No."+(i+1)+": ");
            double pf=sc.nextDouble();
            System.out.print("Enter Income Tax No."+(i+1)+": ");
            double it=sc.nextDouble();
            System.out.print("Enter Professional tax No."+(i+1)+": ");
            double pt=sc.nextDouble();
            em[i]=new Employee(rol,name,age,gs,pf,it,pt,dept);
            if(em[i].calculateSalary()>max_salary){
                max_salary=em[i].calculateSalary();
                idex=i;
            }
        }
        em[idex].displayDetails();
        Employee st1=new Employee();
        System.out.println("The Number of Students Created="+Employee.getCount());
    }

}
