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

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String str = scan.next();
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<str.length();i++) {

            if(!stack.isEmpty() && stack.peek() == str.charAt(i))
                stack.pop();
            else
                stack.push(str.charAt(i));
        }
        System.out.println(stack.size());
        stack.forEach((ch) -> {
            System.out.print(ch);
        });
    }
}
