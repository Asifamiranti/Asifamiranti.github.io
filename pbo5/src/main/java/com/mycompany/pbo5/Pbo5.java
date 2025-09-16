/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pbo5;

/**
 *
 * @author Yura
 */
public class Pbo5 {
    
//class dan Object
    
//class
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Mobil mobilSaya = new Mobil ("Toyota", "Merah", 2025);
        Mobil mobilKedua = new Mobil ("Alpard", "Putih", 2020);
        
        Mobil mobilKetiga = new Mobil ();
        
        Kalkulator cal = new Kalkulator ();
        System.out.println("1 + 10 = " + cal.tambah(1, 10));
        System.out.println("2.4 + 3.3 = " + cal.tambah(2.4, 3.3));
        
    }
}
