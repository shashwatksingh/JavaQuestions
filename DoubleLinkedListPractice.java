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
public class DoubleLinkedListPractice {

    Node head;

    public class Node {

        Node prev;
        Node next;
        int data;

        public Node(int d) {
            data = d;
            prev = null;
            next = null;
        }
    }
    //Checklist of the function that are to be added to this file
    //insert() - start, position, and last
    //delete() - start, last, and particular
    //viewList() - traversal of the linked list
    //getFirst() - getting the first element node
    //getLast() - getting the last element node
    //search() - getting the position of the element of the data

    DoubleLinkedListPractice insertAtStart(DoubleLinkedListPractice list, int data) {
        Node new_node = new Node(data);
        new_node.next = head;
        if (head != null) {
            head.prev = new_node;
        }
        head = new_node;
        return list;
    }
    DoubleLinkedListPractice insertAtLast(DoubleLinkedListPractice list, int data) {
        Node new_node = new Node(data);
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        new_node.prev = curr;
        curr.next = new_node;
        return list;
    }

    void printDoubleLinkedList(DoubleLinkedListPractice list) {
        Node curr = head;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        DoubleLinkedListPractice list = new DoubleLinkedListPractice();
        list = list.insertAtStart(list, 5);
        list.insertAtStart(list, 6);
        list.insertAtStart(list, 10);
        list.insertAtStart(list, 15);
        list.insertAtStart(list, 12);
        list.insertAtStart(list, 3);
        System.out.println("list print");
        list.printDoubleLinkedList(list);
        list.insertAtLast(list, 2);
        System.out.println("list printfor insertion at last");
        list.printDoubleLinkedList(list);
    }
}
