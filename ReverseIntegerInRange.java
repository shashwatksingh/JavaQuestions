/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaquestions;

import java.util.*;

/**
 *
 * @author HP
 */
public class ReverseIntegerInRange {

    public int reverse(int x) {
        int result = 0;
        String str = String.valueOf(x);
        String reverseString = "";
        boolean isNegative = false;
        if (str.charAt(0) == '-') {
            isNegative = true;
            str = str.substring(1);
        }
        for (int i = 0; i < str.length(); i++) {
            reverseString = str.charAt(i) + reverseString;
        }
        try {
            result = Integer.parseInt(reverseString);
            result = isNegative ? (result * -1) : result;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            result = 0;
        }
        return result;
    }

    public int optimisedReverse(int x) {
        int result = 0;
        while (x != 0) {
            if (result > (Integer.MAX_VALUE / 10) || result < (Integer.MIN_VALUE / 10)) {
                result = 0;
                break;
            }
            result = result * 10 + x % 10;
            x /= 10;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the integer");
        int n = scr.nextInt();
        ReverseIntegerInRange obj = new ReverseIntegerInRange();
        System.out.println(obj.reverse(n));
        System.out.println(obj.optimisedReverse(n));
    }
}
