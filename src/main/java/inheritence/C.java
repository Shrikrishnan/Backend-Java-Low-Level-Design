package inheritence;

public class C extends B{

    public C() {
        System.out.println(" Constructor of c  ");
    }

    C(String s){
        this();
        System.out.println(s + " Paramaterised Constuctor ");
    }

}
