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
        System.out.println("Linked List animals: " + animals);
    }
}
