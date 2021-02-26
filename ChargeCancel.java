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

public class ChargeCancel {

    public static void main(String args[]) throws Exception {

        Scanner scr = new Scanner(System.in);

        int N = scr.nextInt();
        scr.nextLine();
        String str = scr.nextLine();
        System.out.println("Strnig entered" + str);
        int i = 0;

        while (i <= str.length() - 2) {
            System.out.println(i);
            if (str.charAt(i) == str.charAt(i + 1)) {
                if (i == 0) {
                    str = str.substring(i + 2);
                } else if (i >= str.length() - 2) {
                    str = str.substring(0, i);
                } else {
                    str = str.substring(0, i) + str.substring(i + 2);
                }
                System.out.println(str);
                if(i>=1)
                    i=i-1;
            } else {
                i++;
            }

        }
        System.out.println(str.length() + "\n" + str);
    }
}
