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

public class ApplicationLinkedList {

    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<>();
        // We use add Method to add values to the linked list
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Tiger");
        animals.add("Giraffe");
        animals.add("Lion");
        animals.add("Rat");
        animals.add("Goat");
        animals.add("Monkey");
        
        // Getting a value for the particaular index
        String str = animals.get(3);
        System.out.println("String at position 3 " + str);
        
        //Change the element at the particaular position
        animals.set(3, "Snake");
        System.out.println("Linked List animals: " + animals);
        
    }
}
