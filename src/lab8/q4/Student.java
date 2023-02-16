package lab8.q4;


public class Student implements Comparable<Student>{
	public String name,section;
	int age;
	public Student(String name, String section, int age) {
		super();
		this.name = name;
		this.section = section;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", section=" + section + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Student o) {
		return this.name.compareTo(o.name);
	}

}
