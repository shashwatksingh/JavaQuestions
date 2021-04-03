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
public class RecursionFibonacci {

    int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n - 2) + fibonacci(n - 1);
    }

    public static void main(String[] args) {
        RecursionFibonacci obj = new RecursionFibonacci();
        for (int i = 1; i <= 6; i++) {
            System.out.print(obj.fibonacci(i) + " , ");
        }
    }
}
