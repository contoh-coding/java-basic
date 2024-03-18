import gravitasi.KalkulatorGravitasi;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Kalkulator Gravitasi");
        double waktuJatuh = 10.0;
        double posisiAkhir = KalkulatorGravitasi.hitungPosisiAkhir(waktuJatuh);
        System.out.println("Posisi objek setalah " + waktuJatuh + " detik adalah " + posisiAkhir + " m.");
        
        // contoh output tanpa error tapi salah
        double d = 5/2;
        System.out.println("5/2 = " + d);

        long saldoBanyak = 1000000000000000000l;
        System.out.println("saldoBanyak = " + saldoBanyak);
        int saldo = (int) saldoBanyak;
        System.out.println("saldo = " + saldo);
    }
}
