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
public class LinkedList {

    //Starting of the linked list
    static Node head;

    public class Node { //Starting an inner class

        int data;
        Node next;

        //Constructor to initialize the state variables
        public Node(int data) {
            next = null;
            this.data = data;
        }
    }

    //Method to inser a new node
    LinkedList insertLinkedList(LinkedList list, int data) {
        //Creating a new node
        Node new_node = new Node(data);
        new_node.next = null;
        //Check if the node just created is empty or not
        if (list.head == null) {
            list.head = new_node;
        } else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }
        return list;
    }

    //Method to traverse the linked list and printing every element
    void printLinkedList(LinkedList list) {
        Node currNode = list.head;
        System.out.println("Linked List:");
        while (currNode != null) {
            System.out.println(currNode.data + " ");
            currNode = currNode.next;
        }
    }

    //Deletion by key
    LinkedList deleteByKey(LinkedList list, int key) {
        Node currNode = list.head, prev = null;
        //If the key to be deleted is at the first index of the linked list
        if (currNode != null && currNode.data == key) {
            list.head = currNode.next;
            System.out.println(key + "found and deleted");
            return list;
        }
        //Iterating through the linked list
        while (currNode != null && currNode.data != key) {
            prev = currNode;
            currNode = currNode.next;
        }
        // After the while loop, the currNode will contain either null if the list is empty or the key is not found. Therefore, we have checked if currNode is null or not
        if (currNode != null) {
            prev.next = currNode.next;
            System.out.println(key + " found and deleted");
        } else if (currNode == null) {
            System.out.println(key + " not found");
        }
        return list;
    }

    //Deleting the element at a particular position
    LinkedList deleteByPosition(LinkedList list, int index) {
        Node currNode = list.head, prev = null;
        // Checking if the element is at the 0 index or not
        if (index == 0 && currNode != null) {
            list.head = currNode.next;
            System.out.println(index + " position element deleted");
            return list;
        }
        //Traversing the limke list while holding the index value in the counter
        int counter = 0;
        while (currNode != null) {
            // Checking if the counter is equal to the index else the currNode will be null
            if (counter == index) {
                prev.next = currNode.next;
                System.out.println(index + " position element deleted");
                break;
            } else {
                prev = currNode;
                currNode = currNode.next;
                counter++;
            }
        }
        if (currNode == null) {
            System.out.println(index + " position element not found");
        }
        return list;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list = list.insertLinkedList(list, 2);
        list = list.insertLinkedList(list, 5);
        list = list.insertLinkedList(list, 6);
        list = list.insertLinkedList(list, 8);
        list = list.insertLinkedList(list, 12);
        list = list.insertLinkedList(list, 15);
        list.printLinkedList(list);
        list = list.deleteByKey(list, 5);
        list.printLinkedList(list);
        list = list.deleteByPosition(list, 3);
        list.printLinkedList(list);
    }
}
