package lab8.q5;

import java.util.Map;
import java.util.TreeMap;

public class q5_ans {
    public static void main(String[] args) {

		Person[] persons = {
				new Person("Bhairavi",22),
				new Person("Dhara",23),
				new Person("Anmol",  23),
				new Person("Megh", 21),
				new Person("Raag",22)
		};
		String[] hobbies = {
               "Singing",
                "Sketching",
                "Reading",
                "Singing",
                "Sketching"
        };
		TreeMap<Person, String> hobbyforperson = new TreeMap<>(new Person());
        hobbyforperson.put(persons[0],hobbies[0]);
        hobbyforperson.put(persons[1],hobbies[1]);
        hobbyforperson.put(persons[2],hobbies[2]);
        hobbyforperson.put(persons[3],hobbies[3]);
        hobbyforperson.put(persons[4],hobbies[4]);

        for (Map.Entry<Person, String> entry : hobbyforperson.entrySet()){
            System.out.println("Key = " + entry.getKey() +
                             ", Value = " + entry.getValue());
        }
	}

}
