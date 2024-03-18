package com.example.app;

/**
 * GoodClass merupakan class untuk latihan
 * menulis code program yang baik
 */
public class GoodClass {
    // untuk menyimpan nama
    String name;

    /**
     * GoodClass defaut constructor
     * 
     * untuk set name = "Good Class"
     */
    public GoodClass() {
        this.name = "Good Class";
    }

    /**
     * GoodClass constructor
     * 
     * @param name nama good class tidak boleh null
     */
    public GoodClass(String name) {
        this.name = name;
    }

    /**
     * Fungsi untuk menampilkan parameter yang dikirm ke layar
     * 
     * @param param parameter yang akan dicetak harus >= 0
     */
    public void goodMethod(int param) {
        System.out.println("name = " + name + ", param = " + param);
    }
}
