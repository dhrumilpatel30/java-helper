package lab2.q5;

public class Student {
    int rollno;
    String name;
    int marks;
    Student(int r,String s,int []m){
        this.rollno = r;
        this.name = s;
        for(int i=0;i<5;i++){
            this.marks+= m[i];
        }
    }
    public int findAvg() {
        return marks / 5;
    }
}
