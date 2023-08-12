package java8Feacctures.lambda;

public class Main {
    public static void main(String[] args) {
        // Way 1 t o  Calling Integface
        DemoFunctinalInterface s= new ClientDemofunction();
        s.fun();;

        // we cant able to  creation of the Integface
        // Why ?  because infecar ar incomplete;

        // way 2 to  functional ? demo Inteface,
        DemoFunctinalInterface way2 = new DemoFunctinalInterface() {
            @Override
            public void fun() {
                System.out.println("Way 2 of the Functional inteface calling ");
            }
        };
        way2.fun();
        // Way 3 -> lambda Interface
        DemoFunctinalInterface way3= ()->{};
        


    }
}
