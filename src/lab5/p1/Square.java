package lab5.p1;

public class Square extends Rectangle{
    public Square() {
        length=1;
        breadth=1;
    }
    public Square(double length){
        this.length=length;
        this.breadth=length;
    }

    @Override
    public String toString() {
        return "This is a Square shape of length: "+length;
    }
}
