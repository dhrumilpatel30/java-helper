package lab5.p1;

public class TestShapes {

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
