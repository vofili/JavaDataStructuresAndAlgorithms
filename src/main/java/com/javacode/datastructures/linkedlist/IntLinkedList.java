package com.javacode.datastructures.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class IntLinkedList {



    //define the operations on the linked list
    static IntNode addFirst(IntNode head, int itemToAdd){
            IntNode newItem = new IntNode(itemToAdd);
            newItem.setNext(head);
            head= newItem;

            return head;
    }


    static boolean detectLoopWithSet(IntNode head){
            Set<IntNode> nodeSet= new HashSet<>();
            while(head != null){

                if(nodeSet.contains(head))
                    return true;

                nodeSet.add(head);
                head = head.getNext();


            }

            return false;
    }

    static IntNode reverseSingleLinkedList(IntNode head){
        IntNode prev=null;
        IntNode next=null;

        IntNode current = head;

        while(current != null)
        {
            next = current.getNext();
            current.setNext(prev);
            prev = current;
            current = next;

        }

        return prev;
    }

    static void printList(IntNode head)
    {
        IntNode current=head;


        while(current != null){
            System.out.println(current);
            current=current.getNext();
        }
        System.out.println();
    }
    public static void main(String[] args) {

        IntNode head = new IntNode(10);
        //creating a hard coded linked list 10->20->30->40->50->60
        head.next=new IntNode(20);
        head.next.next= new IntNode(30);
        head.next.next.next=new IntNode(40);
        head.next.next.next.next=new IntNode(50);
        head.next.next.next.next.next=new  IntNode(60);

        printList(head);

        if(detectLoopWithSet(head)){
            System.out.println("Loop Found");
        }else{
            System.out.println("Loop not found");
        }

        head.next.next.next.next=head;
        //force a loop to occur
        if(detectLoopWithSet(head)){
            System.out.println("Loop Found");
        }else{
            System.out.println("Loop not found");
        }

        //head = reverseSingleLinkedList(head);
        // printList(head);
    }

}



class IntNode{
    int value;
    IntNode next;

    public IntNode(int value) {
        this.value = value;
        this.next = null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public IntNode getNext() {
        return next;
    }

    public void setNext(IntNode next) {
        this.next = next;
    }


    @Override
    public String toString(){
        return "value: "+value;
    }
}
