package contoh.sekolah;

public class BukuPelajaran extends Buku {
    // Atribut tambahan untuk buku pelajaran.
    private String mataPelajaran;
    private String tingkat;

    // Konstruktor untuk membuat objek buku pelajaran.
    public BukuPelajaran(String isbn, String judul, Pengarang pengarang, String penerbit, int tahunTerbit, String mataPelajaran, String tingkat) {
        // Memanggil konstruktor kelas induk (super class).
        super(isbn, judul, pengarang, penerbit, tahunTerbit);
        // Menginisialisasi atribut tambahan buku pelajaran.
        this.mataPelajaran = mataPelajaran;
        this.tingkat = tingkat;
    }

    // Method-method untuk setter dan getter
    public String getMataPelajaran() {
        return mataPelajaran;
    }

    public void setMataPelajaran(String mataPelajaran) {
        this.mataPelajaran = mataPelajaran;
    }

    public String getTingkat() {
        return tingkat;
    }

    public void setTingkat(String tingkat) {
        this.tingkat = tingkat;
    }

    // Method untuk menampilkan data buku pelajaran.
    @Override
    public void cetakData() {
        super.cetakData();
        System.out.println("Mata Pelajaran: " + mataPelajaran);
        System.out.println("Tingkat: " + tingkat);
    }

    @Override
    public String toString() {
        return "{" +
                "isbn: '" + isbn + '\'' +
                ", judul: '" + judul + '\'' +
                ", pengarang: " + pengarang +
                ", penerbit: '" + penerbit + '\'' +
                ", tahunTerbit: " + tahunTerbit + '\'' +
                ", mataPelajaran: '" + mataPelajaran + '\'' +
                ", tingkat: '" + tingkat + '\'' +
                '}';
    }
    
}
