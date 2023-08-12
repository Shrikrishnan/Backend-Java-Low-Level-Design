package AbstractClass;

public class Main {
    public static void main(String[] args) {
        A aa = new A(10) {
            @Override
            void shri() {
                System.out.println("Abstract method Creation ");
            }
        };
        System.out.println(aa.prinln());
    }
}
