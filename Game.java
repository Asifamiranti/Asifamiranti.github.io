/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum7;

/**
 *
 * @author ASUS
 */
public class Game {
    public static void main(String[] args) {
        Player player1 = new Player("Fidi", 100, 10);
        Enemy enemy1 = new Enemy("Milson", 50, 10);
        Goblin goblin1 = new Goblin("Wilson",40, 10);
        
        player1.attack(enemy1);
        enemy1.attack(player1);
        goblin1.attack(player1);
    }
}
