/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugas5;

/**
 *
 * @author ACER
 */
public class Buku {
    String judul ;
    String pengarang;
    int tahunTerbit;
    
    public Buku(){
        this.judul = "Hts jaya";
        this.pengarang = "Asifa miranti";
        this.tahunTerbit = 2020;
    }
    // constructor 2 parameter  
    public Buku(String judul, String pengarang){
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = 2025; 
    }
     // constructor 3 parameter 
     public Buku(String judul, String pengarang, int tahunTerbit){
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
     }
     //Method overloading 1 (tanpa parameter)
     public void tampilkanInfo() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        System.out.println();
    }
     // Method overloading 2 (dengan parameter tambahan)
     public void tampilkanInfo(String tambahan) {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Tahun Terbit: " + tahunTerbit); 
        System.out.println("Catatan: " + tambahan);
    }
}