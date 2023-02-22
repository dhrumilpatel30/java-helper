package lab5.p1;

public class Rectangle extends Shape{
    //default access to use it in child class
    double length;
    double breadth;

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Rectangle(){
        length=1;
        breadth=1;
    }
    public Rectangle(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }

    @Override
    public void findArea() {
        area = length*breadth;
    }

    @Override
    public String toString() {
        return "This is a Rectangle with length and breadth: "+length+" and "+breadth;
    }
}
