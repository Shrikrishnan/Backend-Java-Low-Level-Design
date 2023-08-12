package Collections2;

import javax.swing.*;
import java.util.Collections;
import java.util.PriorityQueue;

public class P {
    public static void main(String[] args) {
        // Min Heap for the Priority Queue
        PriorityQueue<Integer> P = new PriorityQueue<>();
        P.add(2);
        P.add(25);
        P.add(0);
        P.add(89);
        System.out.println(P.peek());
        System.out.println(P.peek());

        // Min Heap for the Priority Queue
        PriorityQueue<Integer> Pp = new PriorityQueue<>(Collections.reverseOrder());
        Pp.add(2);
        Pp.add(25);
        Pp.add(0);
        Pp.add(89);
        System.out.println(Pp.peek()+"Max Heap Priority Queue");
        System.out.println(Pp.peek()+"Max Heap Priority Queue");
        // Priority Queue Implementaion of the Coustom
        PriorityQueue<Car> car1 = new PriorityQueue<>(new SpeedComparator());
        car1.add(new Car(12,"Shri"));
        car1.add(new Car(15,"Krishnen"));
        car1.add(new Car(19,"wer"));
        car1.add(new Car(17,"thas"));
        System.out.println(car1.peek().speed+"Max Heap of car class");




    }
}
