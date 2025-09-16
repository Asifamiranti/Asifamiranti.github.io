/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugas5;

/**
 *
 * @author ACER
 */
public class Tugas5 {

    public static void main(String[] args) {
        // Membuat 3 objek berbeda dengan constructor yang berbeda
        Buku buku1 = new Buku();
        Buku buku2 = new Buku("Romance", "Yura");
        Buku buku3 = new Buku("Dongeng", "Asifa", 2025);
        
        // Menampilkan info menggunakan method overloading
        buku1.tampilkanInfo();
        buku2.tampilkanInfo("Best seller Indonesia");
        buku3.tampilkanInfo("Rekomendasi untuk anak");
    }
}
