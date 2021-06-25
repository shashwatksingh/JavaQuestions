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
public class CircularLinkedListPractice {

    //inner class for the Node creation
    public class Node {

        int data;
        Node next;

        public Node(int d) {
            data = d;
        }
    }
    Node last;

    //displaying the whole circular linked list
    void display(CircularLinkedListPractice list) {
        if (last == null) {
            System.out.println("List is empty");
            return;
        }
        Node curr = last.next;
        do {
            System.out.println(curr.data);
            curr = curr.next;
        } while (curr != last.next);
    }

    //adding an element at the beginning
    void addAtbeginning(int data) {
        Node new_node = new Node(data);
        new_node.next = last.next;
        last.next = new_node;
    }
    
    //Adding to an empty circular linked list
    void addToEmpty (int data) {
        Node new_node = new Node(data);
        last = new_node;
        new_node.next = new_node;
    }
}
