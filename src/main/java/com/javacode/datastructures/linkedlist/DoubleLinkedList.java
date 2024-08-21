package com.javacode.datastructures.linkedlist;



class Node{
    int data;
    Node prev;
    Node next;

    Node(int new_data){
        this.data=new_data;
        this.prev=null;
        this.next=null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +"}";
    }
}
public class DoubleLinkedList {


    public static Node insertItem(Node head, int new_item){
        Node n = new Node(new_item);
        head.setPrev(n);
        n.setNext(head);
        head = n;
        return head;


    }

    public static void printDoublyLinkedList(Node head){
        Node current=head;

        while(current!=null){
            System.out.println(current);
            current = current.getNext();
        }
        System.out.println();
    }

    public static void backwardTransversal(Node head){
        Node previous = head.getPrev();
        while (previous != null){
            System.out.println(previous.toString());
            previous = previous.getPrev();
        }

        System.out.println();
    }
    public static void main(String[] args) {
                Node first = new Node(1);
                Node second = new Node(2);
                Node third = new Node(3);
                first.setNext(second);
                second.setPrev(
                        first
                );
                second.setNext(third);

                third.setPrev(second);

        printDoublyLinkedList(first);

        backwardTransversal(third);
    }


}


