package lab8.q4;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class q4_ans {
    public static void main(String[] args) {
		Student[] arr = {
                new Student("dhrumil","a1",19),
                new Student("name","a2",20),
                new Student("aname","a3",20)
        };
		LinkedList<Student> ll1= new LinkedList<>(Arrays.asList(arr));
		Collections.sort(ll1);
		System.out.println(ll1);
	}
}
