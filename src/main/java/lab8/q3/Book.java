package lab8.q3;


public class Book implements Comparable<Book>{
	String name;
	String authorname;
	String Edition;
	public double price;
	public Book(String name, String authorname, String edition, double price) {
		super();
		this.name = name;
		this.authorname = authorname;
		Edition = edition;
		this.price = price;
	}
	@Override
	public int compareTo(Book o) {
        return Double.compare(this.price, o.price);
    }

}

