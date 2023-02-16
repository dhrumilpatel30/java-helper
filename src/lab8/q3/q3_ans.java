package lab8.q3;

public class q3_ans{
	public static void main(String[] args) {
		Book b1 = new Book("Book1","me","second",25.0);
		Book b2 = new Book("Book2","me","first",25000.0);
		Book b3 = new Book("Book3","me","old",2.50);
		Book b4 = new Book("Book4","me","third",250.0);

		Book[] b = {b1,b2,b3,b4};
		MyClass c1 = new MyClass(b);
		System.out.println("Minimum Price in List: "+c1.findMin());
		System.out.println("Maximum Price in List: "+c1.findMax());


	}
}

