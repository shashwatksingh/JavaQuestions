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

        //The index starts from 0 in the linked list just like arrays
        // Getting a value for the particaular index
        String str = animals.get(3);
        System.out.println("String at position 3 " + str);

        //Change the element at the particaular position
        animals.set(3, "Snake");

        //Remove an element from the head of the list
        System.out.println(animals.remove());

        //Remove an element from the list at a particular index
        System.out.println(animals.remove(2));

        //remove an object
        System.out.println(animals.remove("Goat"));

        //Removing all the elements //same work is done by animals.clear();
        animals.removeAll(animals);

        //Iterating throught the linked list using for each loop
        for (String animal : animals) {
            System.out.print(animal);
            System.out.print(", ");
        }
        
        //To check if an object or a string is present in the linked list
        System.out.println(animals.contains("Owl"));
        
        // Methods to be tried in the next session
        //indexOf(), lastIndexOf(), iterator() -> Returns an iterator to iterate throught the elements
        System.out.println("Linked List animals: " + animals);

    }
}
