package contoh.sekolah;

import java.time.LocalDate;

/**
 * Kelas ini merupakan kelas yang merepresentasikan data pelajar.
 */
public class Pelajar {
    // Atribut-atribut yang dimiliki oleh pelajar.
    String nim;
    String nama;
    LocalDate tglLahir;
    String alamat;

    // Atribut tambahan untuk pelajar yang sedang aktif belajar.
    private String kelas;
    private String jurusan;

    /**
     * Konstruktor untuk membuat objek pelajar.
     * @param nim NIM pelajar.
     * @param nama Nama pelajar.
     * @param tglLahir Tanggal lahir pelajar.
     * @param alamat Alamat pelajar.
     */
    public Pelajar(String nim, String nama, LocalDate tglLahir, String alamat) {
        this.nim = nim;
        this.nama = nama;
        this.tglLahir = tglLahir;
        this.alamat = alamat;
    }

    /**
     * Method untuk mengubah kelas pelajar.
     * @param kelas Kelas baru pelajar.
     */
    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    /**
     * Method untuk mengubah jurusan pelajar.
     * @param jurusan Jurusan baru pelajar.
     */
    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    /**
     * Method untuk menampilkan data pelajar.
     */
    public void cetakData() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Lahir: " + tglLahir);
        System.out.println("Alamat: " + alamat);
        if (kelas != null) {
            System.out.println("Kelas: " + kelas);
        }
        if (jurusan != null) {
            System.out.println("Jurusan: " + jurusan);
        }
    }

    /**
     * Method untuk membandingkan kesamaan objek pelajar.
     * @param obj Objek pelajar yang akan dibandingkan.
     * @return True jika objek pelajar sama, false jika objek pelajar berbeda.
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Pelajar)) {
            return false;
        }
        Pelajar pelajar = (Pelajar) obj;
        return pelajar.nim.equals(nim);
    }

    /**
     * Method untuk menghasilkan kode hash dari objek pelajar.
     * @return Kode hash dari objek pelajar.
     */
    @Override
    public int hashCode() {
        System.out.println("Menghasilkan kode hash untuk nim " + nim + " = " + nim.hashCode());
        return nim.hashCode();
    }
}