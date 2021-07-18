/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaquestions;

//Question - Given a string s, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
//Input: s = "A man, a plan, a canal: Panama"
//Output: true
//Explanation: "amanaplanacanalpanama" is a palindrome.

import java.util.*;

/**
 *
 * @author HP
 */
public class ValidPalindrome {

    public boolean validPalindrome(String s) {
        boolean result = false;
        s = s.toLowerCase();
        String alphaNumericString = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                alphaNumericString += ch;
            }
        }
        if(alphaNumericString.length() == 0 || alphaNumericString.length()==1) return true;
        for (int i = 0; i < alphaNumericString.length() / 2; i++) {
            char ch = alphaNumericString.charAt(i);
            if (ch != alphaNumericString.charAt(alphaNumericString.length() - 1 - i)) {
                result = false;
                return result;
            }
        }
        result = true;
        return result;
    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = scr.nextLine();
        ValidPalindrome obj = new ValidPalindrome();
        System.out.println(obj.validPalindrome(s));
    }
}
