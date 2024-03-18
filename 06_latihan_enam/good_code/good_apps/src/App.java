import com.example.app.GoodClass;
import com.example.app.Hari;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Latihan membuat code yang bagus!");

        int nilai = 80;

        GoodClass goodClass1 = new GoodClass();
        goodClass1.goodMethod(nilai);

        String nama = "Nama Baru";
        GoodClass goodClass2 = new GoodClass(nama);
        goodClass2.goodMethod(nilai);

        System.out.println("------------------");
        Hari hariLibur = Hari.SABTU;
        switch (hariLibur) {
            case SABTU:
                System.out.println("Libur Sabtu");
                break;
            case MINGGU:
                System.out.println("Libur Minggu");
                break;
            default:
                System.out.println("Bukan Hari Libur");
                break;
        }

        String[] daftarNamaBunga = new String[10];
        daftarNamaBunga[0] = "MELATI";
        daftarNamaBunga[9] = "RAFLESIA";

        String namaBunga = daftarNamaBunga[0];
        if (namaBunga.equals("MELATI")){
            System.out.println(namaBunga);
        }
    }
}
