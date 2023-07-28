package ConcurrencyProcessesandThreads;

import static java.lang.Thread.*;

public class Client {
    public static void  doSomething(){
        System.out.println("Do some thing key word " + Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        System.out.print(Thread.currentThread().getName());

        doSomething();
    }
}
// Don't think as a  thread think only in the way of Task
/*What task need to be Done
* For Every TAsk we need to  create an Class for this for every yhtread EHihc need to  done
* Class HelloWordPrinter need to  create
* the Class which we need to be Run in tread we need to implment the keyword Runnabel interface
* if Runnable e is Implements then we need to declare the run value in the method
* The Code Which need to Run in a Separate thred this need to Come in Runnable interface
* From the Place where we what to Run an Thread then we need to Create  an Thred Object
*
* */
