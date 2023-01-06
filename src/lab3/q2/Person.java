package lab3.q2;

public class Person {
    private String name;
    private int age;
    public Person(){
        name="not set";
        age=0;
    }
    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String toString(){
        String str1=String.format("Name is: %s and age is: %d", name, age);
        return str1;
    }

}
