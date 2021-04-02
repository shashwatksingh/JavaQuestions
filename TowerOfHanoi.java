/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaquestions;

/**
 *
 * @author HP
 */
public class TowerOfHanoi {

    public static void main(String[] args) {
        TowerOfHanoi obj = new TowerOfHanoi();
        obj.towerOfHanoi(4, 'A', 'C', 'B');
    }

    void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod) {
        if (n >= 1) {
            towerOfHanoi(n - 1, from_rod, aux_rod, to_rod);
            System.out.println("Move disk " + n + " from " + from_rod + " to rod " + to_rod);
            towerOfHanoi(n - 1, aux_rod, to_rod, from_rod);
        }
        return;
    }
}
