package lab3.q2;

public class Student extends Person{
    private int rollno;
    private double[] marks;
    private static int count;
    static{
        count=0;
    }
    static public int getCount(){
        return count;
    }
    public Student() {
        this.rollno = 0;
        count++;
    }

    public Student(int rollno) {
        this.rollno = rollno;
        count++;
    }

    public Student(int rollno, double[] marks) {
        this.rollno = rollno;
        this.marks = marks;
        count++;
    }

    public Student(int rollno, double[] marks, int age, String name) {
        super(name, age);
        this.rollno = 0;
        this.marks = marks;
        count++;
    }

    public int getRollno() {
        return rollno;
    }

    public double[] getMarks() {
        return marks;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public void setMarks(double[] marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        String str1 = String.format("Name is: %s and age is: %d RollNo. is: %d Marks are: ", getName(), getAge(), rollno);
        for (double i : marks) {
            str1 = str1.concat(i +" ");
        }
        return str1;
    }
    public void displayDetails() {
        System.out.println("Rollno="+rollno);
        System.out.println("Name="+getName());
        System.out.println("age="+getAge());
        System.out.println("marks=");
        for (double i : marks) {
            System.out.println(i+ " ");
        }
    }

}
