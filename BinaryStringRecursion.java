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
public class BinaryStringRecursion {

    void Bin(int n, char ch[]) {
        if (n < 1) {
            for (char element : ch) {
                System.out.print(element);
            }
            System.out.println();
        } else {
            ch[n - 1] = '0';
            Bin(n - 1, ch);
            ch[n - 1] = '1';
            Bin(n - 1, ch);
        }
    }

    public static void main(String[] args) {
        BinaryStringRecursion obj = new BinaryStringRecursion();
        char ch[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        obj.Bin(10, ch);
    }
}
