package lab5.p1;

public class TestShapes {

    static void shapeInfo(Shape obj){
        if(obj instanceof Circle){
            System.out.println(obj.toString());
            System.out.println("Radius="+ ((Circle) obj).getRadius());
        }
        else if(obj instanceof Square){
            System.out.println(obj.toString());
            System.out.println("Length is =" + ((Square) obj).getLength());
        }
        else if(obj instanceof Rectangle){
            System.out.println(obj.toString());
            System.out.println("The length and breath are"+((Rectangle) obj).getLength()+" "+ ((Rectangle) obj).getBreadth());
        }
        else{
            System.out.println(obj.toString());
            System.out.println("Shape is undefined");
        }
    }
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Rectangle r1 = new Rectangle();
        Square s1 = new Square(2.2);

        c1.setRadius(2.2);
        c1.findArea();
        c1.showArea();

        System.out.println(s1.getLength());
        s1.findArea();
        s1.showArea();

        r1.setLength(1.2);
        r1.setBreadth(2.1);
        r1.findArea();
        r1.showArea();

        Rectangle r2 = s1;
        System.out.println(r2.toString());
    }
}
