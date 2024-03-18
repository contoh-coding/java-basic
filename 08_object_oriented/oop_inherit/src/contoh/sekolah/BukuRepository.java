package contoh.sekolah;

import java.util.ArrayList;
import java.util.List;

/**
 * Kelas ini merupakan kelas yang merepresentasikan data repository buku.
 */
public class BukuRepository implements Repository {
    // Simpan data di memory
    private List<Buku> dbBuku = new ArrayList<>();

    // Method untuk menyimpan data.
    public void save(Buku buku) {
        dbBuku.add(buku);
    }
    

    // Method untuk mencari data.
    public List<Buku> find() {
        return dbBuku;
    }
}
