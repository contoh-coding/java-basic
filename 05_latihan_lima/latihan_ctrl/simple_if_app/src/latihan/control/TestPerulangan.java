package latihan.control;

public class TestPerulangan {
    public static void testWhile(int n) {
        // 1! = 1
        // 2! = 2 x 1 = 2
        // 3! = 3 x 2 x 1 = 6
        // 4! = 4 x 3 x 2 x 1 = 24
        // 5! = 5 x 4 x 3 x 2 x 1 = 120 

        // n! = n x (n - 1) x (n - 2) x ... x 3 x 2 x 1;
        int nfac = n;
        while (n > 1) {
            n--;
            nfac = nfac * n;
        }
        System.out.println(n + "! = " + nfac);
    }

    public static void testDoWhile(int n) {
        int nfac = n;
        do {
            n--; // n = n - 1;
            nfac = nfac * n;
        } while (n > 1);

        System.out.println("n factorial = " + nfac);

        // n = 4;
        // nfac = n;

        // n = n - 1;
        // nfac = nfac * n
        
        // n = n - 1;
        // nfac = nfac * n

        // n = n - 1;
        // nfac = nfac * n
    }
}
