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
import java.util.*;

public class EvenOrOdd {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5, 5, 5};
        int[] res = new int[arr.length];
        int ctr = 0, temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            temp = arr[i] ^ temp;
            if (arr[i] != arr[i + 1] || i == arr.length - 2) {
                res[ctr] = temp;
                temp = 0;
                ctr++;
            }
        }
        if (arr[arr.length - 1] == arr[arr.length - 2]) {
            res[ctr-1] = res[ctr-1] ^ arr[arr.length - 1];
        } else {
            res[ctr] = arr[arr.length - 1];
        }
        System.out.println("Resultant arrayA");
        for (int item : res) {
            System.out.print(item + ", ");
        }
    }

}
