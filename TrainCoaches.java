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

public class TrainCoaches {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        int t = scr.nextInt();
        scr.nextLine();
        while (t-- > 0) {
            String s = scr.next();
            int n = s.length();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = (int) (s.charAt(i) - '0');
            }
            boolean b = true;
            Arrays.sort(a);
            for (int i = 0; i < n - 1; i++) {
                if (a[i] != a[i + 1] - 1) {
                    b = false;
                    break;
                }
            }
            if (b) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
