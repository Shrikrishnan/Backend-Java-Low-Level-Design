package ConcurrencyProcessesandThreads.Print100Number;

public class Client {
    public static void main(String[] args) {
        System.out.println(" Program Start");
        System.out.println("Main Thread Name " + Thread.currentThread().getName());
        for(int i=0;i<=100;i++){
            Print100Number t= new Print100Number(i);
            Thread m = new Thread(t);
            m.start();
        }





    }
}
