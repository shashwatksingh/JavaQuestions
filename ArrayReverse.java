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
public class ArrayReverse {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayReverse obj = new ArrayReverse();
        System.out.println("Enter the array length");
        int N =s.nextInt();
        int[] arr = new int[N];
        System.out.println("Enter the array");
        for( int i=0 ; i<N ; i++)
            arr[i] = s.nextInt();
        for(int item: obj.reverse(arr, N))
            System.out.println(item);
    }
    
    public int[] reverse(int[] arr,int N){
        int start=0, end=N-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
}
