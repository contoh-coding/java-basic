public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
        // deklarasi variable
        int umur;
        umur = 17;

        // deklarasi sekligur isi
        double beratBadan =  58;
        double tinggi = 1.73;

        double bmi = beratBadan / (tinggi * tinggi);

        System.out.println("umur = " + umur);
        System.out.println("beratBadan = " + beratBadan);
        System.out.println("tinggi = " + tinggi);
        System.out.println("BMI = " + bmi);
    }
}
