package ConcurrencyProcessesandThreads.Mutithreading;

import com.sun.nio.sctp.SctpSocketOption;

public class CLient {
    public static void main(String[] args) {

        HelloByTrread t = new HelloByTrread();
        Thread m = new Thread(t);
        m.start();

        System.out.println("Bye " + Thread.currentThread().getName());
    }
}
