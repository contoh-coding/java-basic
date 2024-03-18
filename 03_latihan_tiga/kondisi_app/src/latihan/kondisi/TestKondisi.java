package latihan.kondisi;

public class TestKondisi {
    public static void testEquals() {
        int a = 10;
        int b = 10;
        System.out.println("---------------------");
        System.out.println("Test kondisi bilangan");
        System.out.println("---------------------");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b : " + (a > b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a < b : " + (a < b));
        System.out.println("a <= b : " + (a <= b));

        System.out.println("---------------------");
        System.out.println("Test kondisi boolean");
        System.out.println("---------------------");
        boolean c = true;
        boolean d = false;
        System.out.println("c == d : " + (c == d));
        System.out.println("c != d : " + (c != d));
        System.out.println("!d : " + !d);

        System.out.println("---------------------");
        System.out.println("Test kondisi karakter");
        System.out.println("---------------------");
        char c1 = 'a';
        char c2 = 'A';

        System.out.println("c1 == c2 : " + (c1 == c2));
        System.out.println("c1 != c2 : " + (c1 != c2));
        System.out.println("c1 > c2 : " + (c1 > c2));
        System.out.println("c1 < c2 : " + (c1 < c2));

        System.out.println("---------------------");
        System.out.println("Test kondisi string  ");
        System.out.println("---------------------");
        String str1 = new String("Laila");
        String str2 = new String("Laila");
        System.out.println("str1 == str2 : " + (str1 == str2));
        System.out.println("str1 != str2 : " + (str1 != str2));
        System.out.println("str1.equals(str2) : " + (str1.equals(str2)));
        System.out.println("!str1.equals(str2) : " + (!str1.equals(str2)));
    }    
}
