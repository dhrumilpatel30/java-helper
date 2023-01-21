package lab5.p1;

public abstract class Shape {
    public double area;
    abstract public void findArea();

    public void showArea(){
        System.out.println("The area of the shape is: "+area);
    }
    @Override
    public String toString(){
        return "Shape is Undefined";
    }
}
