import java.time.LocalDate;

import contoh.sekolah.Pelajar;

/**
 * Kelas ini merupakan kelas utama yang akan dijalankan.
 */
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Daftar Pelajar");
        System.out.println("===============");
        
        // Membuat objek pelajar.
        LocalDate tglLahir1 = LocalDate.of(2005, 5, 10);
        Pelajar pelajar1 = new Pelajar("240101", "Budi", tglLahir1, "Jl. Merdeka No. 10");

        // Mengubah kelas pelajar. 
        pelajar1.setKelas("XII RPL 1");
        pelajar1.setJurusan("RPL");

        // Menampilkan data pelajar.
        pelajar1.cetakData();
        pelajar1.hashCode();

        System.out.println("----------------");
        // Membuat objek pelajar.
        LocalDate tglLahir2 = LocalDate.of(2006, 7, 15);
        Pelajar pelajar2 = new Pelajar("240102", "Ani", tglLahir2, "Jl. Merdeka No. 11");
        // Pelajar pelajar2 = new Pelajar("Ani", tglLahir2, "Jl. Merdeka No. 11");
        pelajar2.cetakData();

        System.out.println("----------------");
        // Membuat objek pelajar.
        Pelajar pelajar3 = new Pelajar("240101", "Budi", tglLahir1, "Jl. Merdeka No. 10");
        // Mengubah kelas pelajar. 
        pelajar3.setKelas("XII RPL 1");
        pelajar3.setJurusan("RPL");

        // Menampilkan data pelajar.
        pelajar3.cetakData();
        pelajar3.hashCode();

        System.out.println("----------------");
        // cek kesamaan objek pelajar1 dan pelajar3
        if (pelajar1.equals(pelajar3)) {
            System.out.println("Pelajar1 dan Pelajar3 sama");
        } else {
            System.out.println("Pelajar1 dan Pelajar3 berbeda");
        }

        System.out.println("----------------");
        // Membuat object pelajar
        Pelajar pelajar4 = pelajar2;
        // cek kesamaan objek pelajar2 dan pelajar4
        if (pelajar2.equals(pelajar4)) {
            System.out.println("Pelajar2 dan Pelajar4 sama");
        } else {
            System.out.println("Pelajar2 dan Pelajar4 berbeda");
        }
    }
}
