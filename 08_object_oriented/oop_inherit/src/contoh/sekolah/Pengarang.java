package contoh.sekolah;

/**
 * Kelas ini merupakan kelas yang merepresentasikan data pengarang.
 */
public class Pengarang {
   // Atribut-atribut yang dimiliki oleh pengarang.
    private String kode;
    private String nama; 

    /**
     * Konstruktor untuk membuat objek pengarang.
     * @param kode Kode pengarang.
     * @param nama Nama pengarang.
     */
    public Pengarang(String kode, String nama) {
        this.kode = kode;
        this.nama = nama;
    }

    // Method untuk setter dan getter
    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public String toString() {
        return "{kode: '" + kode + "', nama: '" + nama + "'}";
    }
}
