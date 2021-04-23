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
        LinkedList<String> IndianCompanies = new LinkedList<>();
        LinkedList<String> IndianTech = new LinkedList<>();
        
        IndianCompanies.add("Reliance Group");
        IndianCompanies.add("Adani Group");
        IndianCompanies.add("Tata Group");
        IndianCompanies.add("Hindustan Unilever");
        
        IndianTech.add("Wipro");
        IndianTech.add("TCS");
        IndianTech.add("Infosys");
        IndianTech.add("HCL");
        
        //Adding elements to the list
        companies.add("AppleInc.");
        companies.add("Walmart");
        companies.add("Saudi Aramco");
        companies.add("Microsoft");
        
        //Adding an element to the starting of the list
        companies.addFirst("Facebook");
        
        //Adding to the last of the list
        companies.addLast("Alibaba");
        
        //Adding a collection to the list. this extends the previous list.
        companies.addAll(IndianCompanies);
        
        //Adding a collection at a particular index of the list
        companies.addAll(3, IndianTech);
        
        System.out.println(companies);
        
        //adding or inserting elements to a particular index of the list
        companies.add(3, "Berkshire Hathaway Inc.");
        companies.add("Amazon");
        
        //reading values from the list using the index. The index starts from 0
        System.out.println(companies.get(1));
        
        // remove() deletes the first element
        System.out.println(companies.remove());
        
        //How to delete an element at a particular index.
        System.out.println(companies.remove(2));
        
        System.out.println(companies);
        
    }
    
}
