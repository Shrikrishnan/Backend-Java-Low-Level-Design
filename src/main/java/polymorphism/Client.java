package polymorphism;

public class Client {
/*
* There are 2 Type of Polymorpshime
*   1 COmepile Time Polymorpshim => Called as Method overloading
*   2 Run Time Polymorpshim => Called as Methos Overridding
Method Over Loading :
*
*
* is an Concept of in whic if an class overoad the same method with Same name and differtent sigunatur
* but it need to  be having only same return type
*
* Methos Overrdding is an concept of in which we can override the same method with the same
* samereturn type and same sigunature
*
 */
    public static void shrikrishnan(){
        System.out.println("Shrikrishnan Non Paramertized mathed");
    }

    public static void shrikrishnan(String s ,String d){
        System.out.println("Shrikrishnan Paramertized mathed" + s + d);

    }

    //public static String shrikrishnan(Sting m);
    //        return "shri";
    public static void main(String[] args) {

        shrikrishnan();

        A a= new B();
        a.rama();

    }
}
