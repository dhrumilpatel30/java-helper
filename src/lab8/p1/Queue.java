package lab8.p1;

import java.util.ArrayList;
import java.util.List;

public class Queue <T extends Number >{
    int size;


    List<T> queuearray;
    int front_pointer,last_pointer;
    public Queue(int size) {
        this.size = size;
        front_pointer=-1;
        last_pointer=-1;
        queuearray = new ArrayList<>(20);
    }
    public void display(){
        System.out.println("Queue is: ");
        for(int i = front_pointer;i<=last_pointer && i>=0;i++){
            System.out.println(queuearray.get(i)+"  ");
        }
    }
    public void enqueue(T a){
        if(last_pointer == size){
            System.out.println("Queue OverFlow");
            return;
        }
        if(last_pointer < 0){
            front_pointer = 0;
            last_pointer = 0;
        }
        else {
            last_pointer = last_pointer + 1;
        }
        queuearray.add(a);
        queuearray.set(last_pointer, a);
    }
    public T dequeue(){
        if(front_pointer < 0)return null;
        if(front_pointer == last_pointer){
            T value = queuearray.get(front_pointer);
            last_pointer = -1;
            front_pointer = -1;
            return value;
        }
        front_pointer = front_pointer + 1;
        return queuearray.get(front_pointer-1);
    }

}
