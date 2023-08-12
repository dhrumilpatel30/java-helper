package lab2.q5;

/**
 * Represents a student with a roll number, name, and marks.
 * Provides a method to calculate the average marks of the student.
 */
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
