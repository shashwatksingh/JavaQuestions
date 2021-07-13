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

    //Function to calculate the fibonacci term of the nth index
    int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if( n == 1) {
            return 1;
        }
        return fibonacci(n - 2) + fibonacci(n - 1);
    }

    public static void main(String[] args) {
        RecursionFibonacci obj = new RecursionFibonacci();
        //Looping though the number of elements required
        for (int i = 0; i < 10; i++) {
            System.out.print(obj.fibonacci(i) + "  ");
        }
    }
}
