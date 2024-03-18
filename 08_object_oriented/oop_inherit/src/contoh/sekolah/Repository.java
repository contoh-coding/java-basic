package contoh.sekolah;

import java.util.List;

/**
 * Interface ini merupakan interface yang merepresentasikan data repository.
 */
public interface Repository {
    // Method untuk menyimpan data.
    public void save(Buku obj);

    // Method untuk mencari data.
    public List<Buku> find();
} 