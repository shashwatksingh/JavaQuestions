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

        int t =scr.nextInt();
        while(t > 0){
            String n = scr.next();
            int[] temp = new int[4];
            int ctr = 0;
            for(int i=0; i<4; i++){
                temp[i] = (int)n.charAt(i);
            }
            
            Arrays.sort(temp);
            for(var item: temp)
                System.out.print(item+", ");
            System.out.println("");
            for(int i=1; i<4; i++){
                if(temp[i-1] == temp[i]-1 || temp[i-1]==temp[i] ){
                    ctr++;
                }
                System.out.println(ctr);        
            }
            if(ctr==3)
                System.out.println("YES");
            else
                System.out.println("NO");
            t--;
        }  
    }     
}
