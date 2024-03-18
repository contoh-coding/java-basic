package contoh.sekolah;

public class BukuBacaan extends Buku {
    // Atribut tambahan untuk buku bacaan.
    private String jenis;

    // Konstruktor untuk membuat objek buku bacaan.
    public BukuBacaan(String isbn, String judul, Pengarang pengarang, String penerbit, int tahunTerbit, String jenis) {
        super(isbn, judul, pengarang, penerbit, tahunTerbit);
        this.jenis = jenis;
    }

    // Method-method untuk setter dan getter
    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    // Method untuk menampilkan data buku bacaan.
    @Override
    public void cetakData() {
        super.cetakData();
        System.out.println("Jenis: " + jenis);
    }

    @Override
    public String toString() {
        return "{" +
                "isbn: '" + isbn + '\'' +
                ", judul: '" + judul + '\'' +
                ", pengarang: " + pengarang +
                ", penerbit: '" + penerbit + '\'' +
                ", tahunTerbit: " + tahunTerbit + '\'' +
                ", jenis: '" + jenis + '\'' +
                '}';
    }
}
