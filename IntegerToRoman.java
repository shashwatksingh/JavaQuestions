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
public class IntegerToRoman {

    public String convertToRomanBrute(int in) {
        String res = "";

        if (in > 3000) {
            res = "Out of Range";
            return res;
        }

        while (in != 0) {
            if (in >= 1000) {
                res += "M";
                in -= 1000;
            } else if (in >= 900) {
                res += "CM";
                in -= 900;
            } else if (in >= 500) {
                res += "D";
                in -= 500;
            } else if (in >= 400) {
                res += "CD";
                in -= 400;
            } else if (in >= 100) {
                res += "C";
                in -= 100;
            } else if (in >= 90) {
                res += "XC";
                in -= 90;
            } else if (in >= 50) {
                res += "L";
                in -= 50;
            } else if (in >= 40) {
                res += "XL";
                in -= 40;
            } else if (in >= 10) {
                res += "X";
                in -= 10;
            } else if (in >= 9) {
                res += "IX";
                in -= 9;
            } else if (in >= 5) {
                res += "V";
                in -= 5;
            } else if (in >= 4) {
                res += "IV";
                in -= 4;
            } else {
                res += "I";
                in -= 1;
            }
        }
        return res;
    }

    public String convertToRomanOptimized(int in) {
        String[] units = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] thousands = {"", "M", "MM", "MMM"};
        return thousands[in / 1000] + hundreds[(in % 1000) / 100] + tens[(in % 100) / 10] + units[in % 10];
    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the integer");
        int input = scr.nextInt();
        IntegerToRoman obj = new IntegerToRoman();
        System.out.println("Roman Equivalent " + obj.convertToRomanBrute(input));
        System.out.println("Roman Equivalent " + obj.convertToRomanOptimized(input));
    }
}
