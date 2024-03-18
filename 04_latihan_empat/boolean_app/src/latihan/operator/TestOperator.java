package latihan.operator;

public class TestOperator {
    public static void testAnd(){
        int umur = 17;
        String nama = "Majnun";

        // operator && (AND)
        System.out.println("----------------");
        System.out.println("Test oprator AND");
        System.out.println("----------------");
        System.out.println("true && true : " + ((umur == 17) && nama.equals("Majnun")));
        System.out.println("true && false : " + ((umur == 17) && nama.equals("Laila")));
        System.out.println("false && true : " + ((umur == 18) && nama.equals("Majnun")));
        System.out.println("false && false : " + ((umur == 16) && nama.equals("Laila")));

    }

    public static void testOr(){
        int umur = 17;
        String nama = "Majnun";

        // operator || (OR)
        System.out.println("----------------");
        System.out.println("Test oprator OR");
        System.out.println("----------------");
        System.out.println("true || true : " + ((umur == 17) || nama.equals("Majnun")));
        System.out.println("true || false : " + ((umur == 17) || nama.equals("Laila")));
        System.out.println("false || true : " + ((umur == 18) || nama.equals("Majnun")));
        System.out.println("false || false : " + ((umur == 16) || nama.equals("Laila")));

    }

    public static void testNo(){
        String nama = "Majnun";

        // operator || (NOT)
        System.out.println("----------------");
        System.out.println("Test oprator NOT");
        System.out.println("----------------");
        System.out.println("!true : " + (!nama.equals("Majnun")));
    }
}
