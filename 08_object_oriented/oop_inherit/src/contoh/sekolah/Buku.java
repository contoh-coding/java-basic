package contoh.sekolah;

/**
 * Kelas ini merupakan kelas yang merepresentasikan data buku.
 */
public class Buku {
    String isbn;
    String judul;
    // Atribut asosiasi dengan kelas Pengarang
    Pengarang pengarang;
    String penerbit;
    int tahunTerbit;

    /**
     * Konstruktor untuk membuat objek buku.
     * @param isbn ISBN buku.
     * @param judul Judul buku.
     * @param pengarang Pengarang buku.
     * @param penerbit Penerbit buku.
     * @param tahunTerbit Tahun terbit buku.
     */
    public Buku(String isbn, String judul, Pengarang pengarang, String penerbit, int tahunTerbit) {
        this.isbn = isbn;
        this.judul = judul;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.tahunTerbit = tahunTerbit;
    }

    // Method untuk setter dan getter
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public Pengarang getPengarang() {
        return pengarang;
    }

    public void setPengarang(Pengarang pengarang) {
        this.pengarang = pengarang;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    /**
     * Method untuk menampilkan data buku.
     */
    public void cetakData() {
        System.out.println("ISBN: " + isbn);
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Penerbit: " + penerbit);
        System.out.println("Tahun Terbit: " + tahunTerbit);
    }

    @Override
    public String toString() {
        return "{" +
                "isbn: '" + isbn + '\'' +
                ", judul: '" + judul + '\'' +
                ", pengarang: " + pengarang +
                ", penerbit: '" + penerbit + '\'' +
                ", tahunTerbit: " + tahunTerbit +
                '}';
    }
    
}
