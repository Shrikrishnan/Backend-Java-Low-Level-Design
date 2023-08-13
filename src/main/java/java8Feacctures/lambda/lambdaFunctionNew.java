package java8Feacctures.lambda;
//import java.lang.management.ThreadInfo;
import java.util.*;
public class lambdaFunctionNew {
    static class Car {
        int Speed;
        String Name;
        int pr;
        public Car(int speed, String name,int pr) {
            Speed = speed;
            Name = name;
            this.pr=pr;

        }
        public String printCarDetails(){
            return this.Name +" Name "+ this.Speed+"Speed";
        }
//        @Override
//        public int compareTo(Car car) {
//            return this.Speed-car.Speed;
//        }
    }
    public static void main(String[] args) {
        List<Car> list = new ArrayList<>();
        list.add(new Car(10,"A",100));
        list.add(new Car(30,"B",200));
        list.add(new Car(10,"C",40));
        list.add(new Car(40,"E",600));
        list.add(new Car(40,"F",40));
        list.add(new Car(90,"g",50));
        list.add(new Car(80,"d",670));
        list.add(new Car(700,"f",4650));
        list.add(new Car(500,"AQ",4500));
        // Sorting List of Cars using lambda
       Comparator<Car> comparator = (s1,s2)->{
            return s2.Speed -s1.Speed;
        };
        //Collections.sort(list,comparator);
        for(int i =0;i<list.size();i++){
            System.out.println(list.get(i).printCarDetails());
        }
//
//        class df implements Comparable<Car>{
//
//
//            @Override
//            public int compareTo(Car car) {
//                return this.Speed-car.Speed;
//            }
//        }
//        Comparable<Car> d = (s1)->{
//            return this.Speed-s1.Speed;
//        };
        Collections.sort(list,(car1,car2)-> car1.Speed-car2.Speed);
        // Lambda Name
        // (Functions parameter)->{logic}-> lambdas vales
    }
}