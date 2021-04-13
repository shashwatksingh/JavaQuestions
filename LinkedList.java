/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaquestions;

import java.util.concurrent.LinkedBlockingDeque;

/**
 *
 * @author HP
 */
public class LinkedList {
    static Node head;
    public class Node{ //Starting an inner class
        int data;
        Node next;
        public Node(int data){
            next = null;
            this.data = data;
        }
    }
    //Method to inser a new node
    LinkedList insertLinkedList(LinkedList list, int data){
        Node new_node = new Node(data);
        new_node.next = null;
        if(list.head == null){
            list.head = new_node;
        } else {
            Node last = list.head;
            while(last.next != null){
                last = last.next;
            }
            last.next = new_node;
        }
        return list;
    }
    //Method to traverse the linked list and printing every element
    void printLinkedList (LinkedList list) {
        Node currNode = list.head;
        System.out.println("Linked List:");
        while(currNode != null) {
            System.out.println(currNode.data + " ");
            currNode = currNode.next;
        }
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list = list.insertLinkedList(list, 2);
        list = list.insertLinkedList(list, 5);
        list = list.insertLinkedList(list, 6);
        list.printLinkedList(list);
    }
}
