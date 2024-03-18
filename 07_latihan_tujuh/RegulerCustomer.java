public class RegulerCustomer implements Customer {

    private String nama;
    private String kota;

    @Override
    public void daftar(String nama, String kota) {
        this.nama = nama;
        this.kota = kota;
    }

    @Override
    public void detail() {
        System.out.println("Nama Customer Regular = " + nama + ", kota = " + kota);
    }
    
    @Override
    public String toString() {
        return "{nama: " + nama + ", kota: " + kota + "}";
    }
}
