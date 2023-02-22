package lab5.p1;

public class Circle extends Shape{
    private double radius;

    public Circle() {
        radius=1;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void findArea() {
        area = 3.14*radius*radius;
    }

    @Override
    public String toString() {
        return "This is circle of radius " + radius;
    }
}
