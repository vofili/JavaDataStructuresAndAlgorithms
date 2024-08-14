package com.javacode.algorithms;


class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CyclicSinglyLinkedList {
    public static void main(String[] args) {
        // Creating nodes
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);

        // Linking nodes to form a list: 1 -> 2 -> 3 -> 4 -> 2 (cyclic back to second node)
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = second; // Creates the cycle by pointing the last node back to the second node

        // Detect if the linked list has a cycle
        boolean hasCycle = hasCycle(head);
        System.out.println("Does the linked list have a cycle? " + hasCycle);
    }

    // Function to detect a cycle in a singly linked list using Floyd’s Cycle-Finding Algorithm
    public static boolean hasCycle(Node head) {
        if (head == null) {
            return false;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;           // Move slow pointer by one step
            fast = fast.next.next;      // Move fast pointer by two steps

            if (slow == fast) {         // If they meet, there's a cycle
                return true;
            }
        }

        return false; // No cycle detected
    }
}
