package ConcurrencyProcessesandThreads.executerService;

public class Print100Number implements Runnable{
    private int i;

    public Print100Number(int i) {
        this.i = i;
    }

    public Print100Number() {
    }

    public void  run(){
        System.out.println(i +" Thread Printed By  " + Thread.currentThread().getName());
    }
}
