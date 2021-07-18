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
public class RomanToInteger {

    public int convert(String s) {
        int result = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (i == 0) {
                result += map.get(curr);
            } else {
                char prev = s.charAt(i - 1);
                result = map.get(prev) < map.get(curr) ? result - (2 * map.get(prev)) + map.get(curr) : result + map.get(curr);
            }
            System.out.println(result);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the Roman Numeral");
        String romanString = scr.nextLine();
        RomanToInteger obj = new RomanToInteger();
        System.out.println("Result is " + obj.convert(romanString));
    }
}
