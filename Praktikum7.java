/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.praktikum7;

/**
 *
 * @author ASUS
 */
public class Praktikum7 {

    public static void main(String[] args) {
        BarangElektronik p1 = new BarangElektronik("Laptop", 5000000, 12);
        p1.tampilkanInfo();
        System.out.println("------------------------------------");
        p1.tampilkanGaransi();
        System.out.println("------------------------------------");
        Produk p2 = new Produk("Buku", 150000);
        Produk p3 = new BarangElektronik("Mouse", 150000, 12);
        p2.tampilkanInfo();
        System.out.println("Pajak Produk Biasa       : " + p2.hitungPajak());
        System.out.println("Harga Akhir Produk Biasa : " + p2.hitungHarga());
        System.out.println("------------------------------------");
        p3.tampilkanInfo();
        System.out.println("Pajak Produk Elektronik       : " + p3.hitungPajak());
        System.out.println("Harga Akhir Produk Elektronik : " + p3.hitungHarga());
    }
}
