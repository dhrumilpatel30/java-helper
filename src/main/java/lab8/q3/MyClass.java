package lab8.q3;

import java.util.Comparator;

public class MyClass implements Comparator<Book>,MinMax<Book> {

	Book[] book_array;

	public MyClass(Book[] book_array) {
		super();
		this.book_array = book_array;
	}

	@Override
	public int compare(Book o1, Book o2) {
		return o1.compareTo(o2);
	}

	@Override
	public double findMin() {
		Book min = book_array[0];
		for(Book b: book_array) {
			if(compare(b, min) < 0) {
				min = b;
			}
		}
		return min.price;
	}

	@Override
	public double findMax() {
		Book max = book_array[0];
		for(Book b: book_array) {
			if(compare(b, max) > 0) {
				max = b;
			}
		}
		return max.price;
	}

}

