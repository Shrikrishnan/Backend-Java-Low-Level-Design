package ConcurrencyProcessesandThreads.executerService;

import java.util.concurrent.Executor;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        System.out.println(" Program Start");
        System.out.println("Main Thread Name " + Thread.currentThread().getName());
        //Executor s = Executors.newFixedThreadPool(10);
        Executor s = Executors.newCachedThreadPool();
        //  Create when we dont know the Size of the Thread pool

        for(int i=0;i<=1000;i++){
            if(i==5 || i==10 || i==50){
                System.out.println();
            }
            Print100Number t= new Print100Number(i);
            s.execute(t);
        }
        ((ExecutorService) s).shutdown();





    }
}
