package inheritence;

public class D extends C{
    public D() {
        super("Shrikrishnan");
        System.out.println(" Constructor of D  ");

    }
    public D(String S) {
       // super("Shrikrishnan");
        this();
        System.out.println(" Constructor of D  " + S + " Paramaterised");


    }
}
