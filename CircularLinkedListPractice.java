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

    //creating a list
    void createList() {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the number of values");
        int n = scr.nextInt();
        System.out.println("Enter first data for the list");
        addToEmpty(scr.nextInt());
        for (int i = 2; i < n; i++) {
            System.out.println("Enter data");
            addToEnd(scr.nextInt());
        }
    }

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
    void addToEmpty(int data) {
        Node new_node = new Node(data);
        last = new_node;
        new_node.next = new_node;
    }

    //add to the end of the circular linked list
    void addToEnd(int data) {
        Node new_node = new Node(data);
        new_node.next = last.next;
        last.next = new_node;
        last = new_node;
    }

    //add after a particular item in a circular linked list
    void addAfter(int data, int item) {
        Node curr = last.next;
        do {
            if (curr.data == item) {
                Node new_node = new Node(data);
                new_node.next = curr.next;
                curr.next = new_node;
                if (curr == last) {
                    last = new_node;
                }
                return;
            }
            curr = curr.next;
        } while (curr != last.next);
        System.out.println("Item not found in the list");
    }

    //deleting a node inm circular linked list
    void del(int item) {
        Node curr = last.next;
        //Checking if list is empty
        if (last == null) {
            System.out.println("List is empty");
            return;
        }
        //Check if the item is the is the only item of the list
        if (last == last.next && last.data == item) {
            last = null;
            return;
        }
        //Check  if the item is the first item of the list
        if (last.next.data == item) {
            last.next = last.next.next;
            return;
        }
        
        while (curr.next != last) {
            if (curr.next.data == item) {
                curr.next = curr.next.next;
            }
            curr = curr.next;
        }
        if (last.data == item) {
            curr.next = last.next;
            last = curr;
            return;
        }
        System.out.println(item + " not found");
    }

    //main function
    public static void main(String[] args) {
        CircularLinkedListPractice list = new CircularLinkedListPractice();
//        while (true) {
//            System.out.println("1. Create List");
//            System.out.println("2. Display List");
//            System.out.println("3. Add to Empty List");
//            System.out.println("4. Add to Beginning of List");
//            System.out.println("5. Add to End of List");
//            System.out.println("6. Add after item in List");
//            System.out.println("7. Delete");
//            System.out.println("8. Exit");
//            System.out.println("Enter Choice");
//            Scanner scr = new Scanner(System.in);
//            int choice = scr.nextInt();
//            switch (choice) {
//                case 1:
//                    list.createList();
//                    break;
//                case 2:
//                    list.display(list);
//                    break;
//                case 3:
//                    System.out.println("Enter number");
//                    list.addToEmpty(scr.nextInt());
//                    break;
//                case 4:
//                    System.out.println("Enter number");
//                    list.addAtbeginning(scr.nextInt());
//                    break;
//                case 5:
//                    System.out.println("Enter number");
//                    list.addToEnd(scr.nextInt());
//                    break;
//                case 6:
//                    System.out.println("Enter number");
//                    int value = scr.nextInt();
//                    System.out.println("Enter the item after which you want to enter the value");
//                    int item = scr.nextInt();
//                    list.addAfter(value, item);
//                    break;
//                case 7:
//                    System.out.println("Enter number");
//                    int val = scr.nextInt();
//                    list.del(val);
//                    break;
//                case 8:
//                    return;
//                default:
//                    list.display(list);
//            }
//            
//        }
        
    }
}
