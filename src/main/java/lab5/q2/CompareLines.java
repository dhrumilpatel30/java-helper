package lab5.q2;

public class CompareLines {
    public static void main(String[] args) {
		Line l1 = new Line(1,2,3,4);
		Line l2 = new Line(1,2,5,6);
//		Line l3 = new Line(3,4,5,6);

		System.out.println(l1.isEqual(l2));
		System.out.println(l1.isGreater(l2));
		System.out.println(l1.isLess(l2));
 	}

}
