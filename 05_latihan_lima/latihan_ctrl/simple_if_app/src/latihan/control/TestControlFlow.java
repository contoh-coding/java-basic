package latihan.control;

public class TestControlFlow {
    public static void testIf(int n){
        if (n < 0) {
            System.out.println(n + " adalah negatif.");
        }
        if (n > 0 ) {
            System.out.println(n + " adalah positif");
        }
        if (n == 0) {
            System.out.println(n + " adalah 0");
        }
    }

    public static void testIfElse(int n){
        if (n < 0) {
            System.out.println(n + " adalah negatif.");
        } else if (n > 0 ) {
            System.out.println(n + " adalah positif");
        } else {
            System.out.println(n + " adalah 0");
        }
    }
}
