package lab3.p1;
import lab3.q2.Person;
public class Employee extends Person{
    private final int Employee_id;
    private String Department;
    private double Gross_salary;
    private double Provident_Fund;
    private double Income_tax;
    private double Professional_tax;
    private static int count;
    static{
        count=0;
    }
    static public int getCount(){
        return count;
    }
    public Employee() {
        this.Employee_id = 0;
        count++;
    }

    public Employee(int Emploid, String Emp_name, int age) {
        this.Employee_id = Emploid;
        this.setAge(age);
        this.setName(Emp_name);
        count++;
    }
    public Employee(int Emploid, String Emp_name, int age,double Gross_salary,double Provident_Fund,double Income_tax,double Professional_tax, String Dept) {
        this.Employee_id = Emploid;
        this.setAge(age);
        this.setName(Emp_name);
        this.Gross_salary=Gross_salary;
        this.Provident_Fund=Provident_Fund;
        this.Income_tax=Income_tax;
        this.Professional_tax=Professional_tax;
        this.Department=Dept;
        count++;
    }
    public double calculateSalary(double Gross_salary,double Provident_Fund,double Income_tax,double Professional_tax){
        return Gross_salary+Provident_Fund-Income_tax-Professional_tax;
    }
    public double calculateSalary(){
        return Gross_salary+Provident_Fund-Income_tax-Professional_tax;
    }

    @Override
    public String toString() {
        return String.format("Name is: %s and age is: %d salary is: %f Marks are: ", getName(), getAge(), calculateSalary());
    }
    public void displayDetails() {
        System.out.println("Employee ID="+Employee_id);
        System.out.println("Employee Name="+getName());
        System.out.println("age="+getAge());
        System.out.println("Department : "+ Department);
        System.out.println("salary="+calculateSalary());
    }
}
