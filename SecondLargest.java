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
import java.util.Scanner;

public class SecondLargest {

    int maxElem(int[] arr) {
        int len = arr.length;
        int minCtr = 0;
        int max = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        if (len < 2) {
            System.out.println("Invalid Input");
            return arr[0];
        }
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
            if (i == Integer.MIN_VALUE) {
                minCtr++;
            }
        }
        for (int i : arr) {
            if (i != max && max2 < i) {
                max2 = i;
            }
        }
        if (max2 == Integer.MIN_VALUE && minCtr == len) {
            System.out.println("No second max value");
        } else {
            System.out.print(max2 + "is the second largest element");
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println(Integer.MIN_VALUE);
        System.out.println("Enter the length if the array");
        int n = scr.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            arr[i] = scr.nextInt();
        }
        SecondLargest obj = new SecondLargest();
        System.out.println(obj.maxElem(arr));
    }

}
