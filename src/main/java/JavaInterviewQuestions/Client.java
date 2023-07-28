package JavaInterviewQuestions;

public class Client {
    public static void main(String[] args) {

        String s1 = " Hello ";
        String s2 = " Hello ";
        String s3 = new String("Hello");
        String s4 = new String("Hello");

        

        System.out.println(s1==s3);
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
        System.out.println(System.identityHashCode(s3));
        System.out.println(System.identityHashCode(s4));



    }
}
