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
public class QueueUsingArrays {

    //operations
    //isEmptyQueue(), isFullQueue(), queueSize(), enQueue(), Dequeue(), deleteQueue()
    int front, rear;
    int capacity;
    int[] arr;

    //constructor to initialize the class variables
    public QueueUsingArrays(int cap) {
        front = -1;
        rear = -1;
        capacity = cap;
        arr = new int[cap];
    }

    //returns true if the queue is empty
    boolean emptyQueue() {
        if (front == -1) {
            return true;
        }
        return false;
    }

    //See if the queue is full or not
    boolean isFullQueue() {
        return (rear + 1 % capacity == front);
    }

    //Returns the number of elements in the queue
    int size() {
        return ((capacity + rear - front + 1) % capacity);
    }

    //Enqueueing the data
    void enQueue(int data) {
        if (isFullQueue()) {
            System.out.println("Overflow");
        } else {
            rear = (rear + 1) % capacity;
            arr[rear] = data;
            front = front == -1 ? rear : front;
        }
    }

    //Dequeueing the data
    int deQueue() {
        int index = -1;
        if (emptyQueue()) {
            System.out.println("Underflow");
        } else {
            index = front;
            front = front == rear ? --rear : (front + 1) % capacity;
        }
        return index;
    }
    
    //deleting 

    public static void main(String[] args) {
        
    }
}
