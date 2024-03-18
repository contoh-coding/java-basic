import java.time.LocalDate;
import java.util.List;

import contoh.sekolah.Buku;
import contoh.sekolah.BukuBacaan;
import contoh.sekolah.BukuPelajaran;
import contoh.sekolah.BukuRepository;
import contoh.sekolah.Pelajar;
import contoh.sekolah.Pengarang;
import contoh.sekolah.Repository;

/**
 * Kelas ini merupakan kelas utama yang akan dijalankan.
 */
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Daftar Buku Pelajaran");
        System.out.println("=====================");

        // Membuat object pengarang
        Pengarang pengarang1 = new Pengarang("001", "Indrajani");

        // Membuat objek buku pelajaran.
        Buku bukuPel1 = new BukuPelajaran(
            "978-979-22-5679-4", 
            "Pemrograman Berorientasi Objek", 
            pengarang1, 
            "Erlangga", 
            2019, 
            "Pemrograman", 
            "XII");

        // Membuat objek buku pelajaran.
        Buku bukuPel2 = new BukuPelajaran(
            "978-979-22-5679-5", 
            "Algoritma dan Struktur Data", 
            pengarang1, 
            "Erlangga", 
            2019, 
            "Pemrograman", 
            "XII");

        // Membuat oject buku bacaan
        Buku bukuBacaan1 = new BukuBacaan(
            "999-979-22-5679-1", 
            "Bumi Manusia", 
            pengarang1, 
            "Gramedia", 
            2023, 
            "Novel");

        // // Menampilkan data buku pelajaran.
        // bukuPel1.cetakData();
        // System.out.println("---------------------");
        // bukuPel2.cetakData();
        // System.out.println("---------------------");
        // bukuBacaan1.cetakData();
        // System.out.println("---------------------");

        // Panggil to string
        System.out.println(bukuPel1);
        System.out.println(bukuPel2);
        System.out.println(bukuBacaan1);
        System.out.println("---------------------");

        // Membuat object repository buku
        System.out.println();
        System.out.println("Simpan data buku ke repository");
        System.out.println("==============================");

        Repository repoBuku = new BukuRepository();
        repoBuku.save(bukuPel1);
        repoBuku.save(bukuPel2);
        repoBuku.save(bukuBacaan1);

        // Menampilkan data buku dari repository
        List<Buku> daftarBuku = repoBuku.find();
        for (Buku buku : daftarBuku) {
            System.out.println(buku.getIsbn() + " - " + buku.getJudul() + " - " + buku.getPenerbit() + " - " + buku.getTahunTerbit());
        }
    }
}
