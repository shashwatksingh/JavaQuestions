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

public class ArrayShift {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayShift obj = new ArrayShift();
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        int N = arr.length;
        System.out.println("Enter the rotate basis");
        int K = s.nextInt();
        for (int items : obj.rightShift(arr, N, K)) {
            System.out.print(items);
        }
        s.close();
    }

    public int[] rightShift(int[] arr, int N, int K) {
        int i = 0, j = 0, k = 0, temp = 0;
        for (; i < gcd(N, K); i++) {
            temp = arr[N - i - 1];
            j = N - i - 1;
            while (true) {
                k = j - K < 0 ? (j - K + N) % N : (j - K) % N;

                if (k == (N - i - 1)) {
                    break;
                }
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }
        return arr;
    }

    public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

}
