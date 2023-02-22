package lab8.q5;

import java.util.Comparator;

public class Person implements Comparator<Person>{
	String name;
	int age;
	public Person(){}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	@Override
	public int compare(Person o,Person n) {
		return o.name.compareTo(n.name);
	}

}

