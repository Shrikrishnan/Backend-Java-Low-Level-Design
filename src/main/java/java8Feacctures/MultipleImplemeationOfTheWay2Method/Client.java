package java8Feacctures.MultipleImplemeationOfTheWay2Method;

public class Client {
    public static void main(String[] args) {
     DemoInteface d = new DemoInteface() {
         @Override
         public void fun() {
             System.out.println("Demo 1");
         }

         @Override
         public void fun2() {
             System.out.println("Demo 2");
         }

         @Override
         public void fun3() {
             System.out.println("Demo 3");
         }
     };

     d.fun();
     d.fun3();
     d.fun2();
    }
}
