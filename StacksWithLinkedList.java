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
public class StacksWithLinkedList {

    Node top;

    class Node {

        int data;
        Node next;

        public Node(int d) {
            data = d;
            next = null;
        }
    }

    boolean push(int data) {
        Node new_node = new Node(data);
        if (top == null) {
            top = new_node;
            return true;
        }
        new_node.next = top;
        top = new_node;
        return true;
    }

    int pop() throws LinkedListEmptyException {
        if (top != null) {
            int value = top.data;
            top = top.next;
            return value;
        }
        throw new LinkedListEmptyException("Stack Underflow");
    }

    int peek() throws LinkedListEmptyException {
        if (top != null) {
            int value = top.data;
            return value;
        }
        throw new LinkedListEmptyException("Empty Stack");
    }

    void display() {
        Node curr = top;
        while (curr.next != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        StacksWithLinkedList stack = new StacksWithLinkedList();
        System.out.println("Kindly select the options from the given menu");
        System.out.println("1. push ");
        System.out.println("2. pop ");
        System.out.println("3. peek ");
        System.out.println("4. display ");
        System.out.println("5. exit ");
        while (true) {
            System.out.println("Enter choice");
            int choice = scr.nextInt();
            try {
                switch (choice) {
                    case 1:
                        System.out.println("Enter data");
                        int data = scr.nextInt();
                        stack.push(data);
                        break;
                    case 2:
                        System.out.println("Data is - " + stack.pop());
                        break;
                    case 3:
                        System.out.println("Data is - " + stack.peek());
                        break;
                    case 4:
                        System.out.println("Stack is - ");
                        stack.display();
                        break;
                    case 5:
                        return;
                }
            } catch (IndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

//Copied to make a custom exception
class LinkedListEmptyException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public LinkedListEmptyException() {
        super();
    }

    public LinkedListEmptyException(String message) {
        super(message);
    }
}
