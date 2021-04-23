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
import java.util.LinkedList;
public class LinkedListPractice {
    //In this class, idea is to practice various data structures implementation using the Linked lists
    public static void main(String[] args) {
        LinkedList<String> companies = new LinkedList<>();
        //Adding elements to the list
        companies.add("AppleInc.");
        companies.add("Walmart");
        companies.add("Saudi Aramco");
        companies.add("Microsoft");
        //adding or inserting elements to a particular index of the list
        companies.add(3, "Berkshire Hathaway Inc.");
        companies.add("Amazon");
        
        //reading values from the list using the index. The index starts from 0
        System.out.println(companies.get(1));
        
        System.out.println(companies);
        
    }
    
}
