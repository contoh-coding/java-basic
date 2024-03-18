import java.util.ArrayList;
import java.util.List;

public class StrukturDataApp {
    public static void main(String[] args) {
        System.out.println("--- Latihan List<String> ---");

        List<String> listNama = new ArrayList<>();
        listNama.add("Hamzah");
        listNama.add("Kevin");
        listNama.add("Ade");
        listNama.add("Robi");

        String namaHamzah = listNama.get(0);
        String namaObi = listNama.get(3);
        System.out.println("Nama ke-0 = " + namaHamzah);
        System.out.println("Nama ke-3 = " + namaObi);
        System.out.println("--- Print semua listNama ---");

        int i = 0;
        for (String nama : listNama) {
            System.out.println("nama ke - " + i + " = " + nama);
            i++;
        }

        // menggunakan tipe data interface
        // dan clas implementasinya
        Customer cust1 = new RegulerCustomer();
        cust1.daftar("Robi", "Lampung");
        // cust1.detail();

        System.out.println("--- Latihan List generic ---");
        
        List listObject = new ArrayList();
        listObject.add("Rafif");
        listObject.add(Integer.valueOf(100));
        listObject.add(Boolean.TRUE);
        listObject.add(cust1);

        i = 0;
        for (Object obj : listObject) {
            System.out.println("obj ke - " + i + " = " + obj);
            i++;
        }

    }
}