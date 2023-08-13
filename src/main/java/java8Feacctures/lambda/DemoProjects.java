package java8Feacctures.lambda;

import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

public class DemoProjects{
    public static void main(String[] args) {
//        Consumer<String> s = new Consumer() {
//            @Override
//            public void accept(Object o) {
//                System.out.println("Shrikrishnan balakrishnan");
//            }
//        };
//        s.accept(new String("Shrikrishnan  "));
            Consumer<String> S =  new Consumer<String>() {
                @Override
                public void accept(String s) {
                    System.out.print("Stting ");
                }
            };

            S.accept("Shri");
            // lambda
            // ()-> Pass the funcetion argument
            //{} -> Implementaion part
            //lambda function can only use default methods
            Consumer<String> counsumer2 = (str)->{
                System.out.println("Hello" + str);
            };
            counsumer2.accept("Shrikrihsnsn");

        BiPredicate<String,String> temp = new BiPredicate<String, String>() {
            @Override
            public boolean test(String s, String s2) {
                if(s.equals(s2)){
                    System.out.println(true);
                    return true;
                }
                System.out.println(false);
                return false;
            }
        };

        temp.test("Shrdfi","Shri");


        BiPredicate<String,String> s =(str,str1)->{
            if(str.equals(str1)){
                System.out.println(true+ " By labda Functions");
                return true;
            }
            System.out.println(false+ " By labda Functions");
            return false;
        };
        s.test("Shri","Shr");
        BinaryOperator<Integer>  d2;
        d2 = (s1, s2)->{
            return s1+s2;
        };
        int s4 =d2.apply(10,10);
        System.out.println(s4);
    }
}


