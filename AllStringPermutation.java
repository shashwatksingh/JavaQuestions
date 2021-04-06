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
public class AllStringPermutation {

    static int count;

    void permutation(String str, int i, int n) {
        int j = 0;
        if (i == n) {
            count++;
            System.out.println("Count is: " + count + " String is: " + str);
        } else {
            for (j = i; j <= n; j++) {
                str = swap2(str, i, j);
                permutation(str, i + 1, n);
                str = swap2(str, i, j); //Backtracking
            }
        }
    }

    String swap(String str, int i, int j) {
        String res = "";
        char pos_i = str.charAt(i);
        char pos_j = str.charAt(j);
        if (i != j) {
            res = str.substring(0, i) + pos_j + str.substring(i + 1, j) + pos_i + str.substring(j + 1);
        } else {
            res = str;
        }
        return res;
    }

    //Alternate swapping method
    String swap2(String str, int i, int j) {
        char ch[] = str.toCharArray();
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        return String.valueOf(ch);
    }

    public static void main(String[] args) {
        AllStringPermutation obj = new AllStringPermutation();
        String str = "ABC";
        obj.permutation(str, 0, str.length() - 1);
    }

}
