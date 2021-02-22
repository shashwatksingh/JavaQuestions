/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaquestions;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class SeatArrangement {
    public static void main(String[] args){
        Scanner scr =new Scanner(System.in);
        int T = scr.nextInt();
        String seat ="";
        while(T-- > 0){
            int N = scr.nextInt();

            int ctr = 0, temp = N ,i=0;
            while(temp>12){
                temp-=12;
                ctr++;
            }

            
            temp = 12-temp+1;

            if(temp == 1 || temp == 12 || temp == 6 || temp==7)
                seat = "WS";
            else if(temp == 2 || temp == 11 || temp == 5 || temp==8)
                seat = "MS";
            else if(temp == 3 || temp == 4 || temp == 9 || temp==10)
                seat = "AS";            
            System.out.print(temp+12*ctr);
            System.out.print(" "+seat);
            System.out.println();
        }            
    }


}
