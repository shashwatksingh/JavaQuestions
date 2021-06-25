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
        if (head == null) {
            head = new_node;
            return list;
        }
        while (curr.next != null) {
            curr = curr.next;
        }
        new_node.prev = curr;
        curr.next = new_node;
        return list;
    }

    DoubleLinkedListPractice insertAfter(DoubleLinkedListPractice list, int pos, int data) {
        Node new_node = new Node(data);
        int ctr = 0;
        Node curr = head;
        if (head == null) {
            head = new_node;
            return list;
        }
        while (curr.next != null && ctr != pos) {
            curr = curr.next;
            ctr++;
        }
        //Checking if the length of the linked list is less than the pos
        if (ctr < pos) {
            System.out.println("The position does not exist");
        } else {
            //Checking if the position is of the last element in the linked list
            if (curr.next != null) {
                new_node.next = curr.next;
                curr.next.prev = new_node;
                new_node.prev = curr;
                curr.next = new_node;
                System.out.println("Added " + data);
            } else {
                list = insertAtLast(list, data);
            }
        }

        return list;
    }
    
    void deleteFirst(DoubleLinkedListPractice list) {
        if(head == null){
            System.out.println("Nothing to delete. The list is empty");
        } else {
            head = head.next;
            System.out.println("Deleted "+ head.prev.data);
            head.prev = null;
        }
    }

    void printDoubleLinkedList(DoubleLinkedListPractice list) {
        Node curr = head;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

    Node search(DoubleLinkedListPractice list, int data) {
        Node curr = list.head;
        if (head == null) {
            return null;
        } else {
            while (curr.next != null) {
                if (curr.data == data) {
                    return curr;
                }
                curr = curr.next;
            }
        }
        return null;
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
        System.out.println("After position insertion");
        list.insertAfter(list, 3, 27);
        list.printDoubleLinkedList(list);
        System.out.println("position " + list.search(list, 27));
        list.deleteFirst(list);
        list.printDoubleLinkedList(list);
    }
}
