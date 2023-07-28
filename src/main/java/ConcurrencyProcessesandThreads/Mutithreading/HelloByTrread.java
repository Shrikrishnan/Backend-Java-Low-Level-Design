package ConcurrencyProcessesandThreads.Mutithreading;

public class HelloByTrread implements  Runnable{

    @Override
    public void run() {
        System.out.println("Thread Created  - Thread Name "+ Thread.currentThread().getName());
        System.out.println("Thread Created - Thread id "+ Thread.currentThread().threadId());

    }
}
