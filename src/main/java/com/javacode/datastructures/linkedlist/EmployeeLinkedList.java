package com.javacode.datastructures.linkedlist;

public class EmployeeLinkedList {



    public static EmployeeNode reverseLinkedList(EmployeeNode head){
        EmployeeNode prev=null;
        EmployeeNode next=null;
        EmployeeNode current = head;

        while (current  != null){


            next = current.getNext();
            current.setNext(prev);
            prev = current;
            current=next;


        }
        return prev;
    }

    public static EmployeeNode insertLast(EmployeeNode head,Employee newData){

        EmployeeNode current = head;
        while(current.getNext() != null){
            current = current.getNext();
        }
        EmployeeNode newNode = new EmployeeNode(newData);
        newNode.setNext(current.getNext());
        current.setNext(newNode);
            //already at last node

       return newNode;
    }
    public static EmployeeNode insertAtPosition(EmployeeNode head, int position, Employee insertData){
        EmployeeNode newNode = new EmployeeNode(insertData);
        EmployeeNode current = head;

        if(position == 1){
            newNode.setNext(head.getNext());
            head.setNext(newNode);
        }
        for(int i = 1; i <= position; i++){
            current = current.getNext();
        }
        if(current == null){
            return head;
        }
        newNode.setNext(current.getNext());

        current.setNext(newNode);

        return newNode;


    }

    public static EmployeeNode insertAfter(EmployeeNode head, Employee keyData, Employee newData){
        //transverse the list starting from the head
        //check if the current element is the same as the keyData.
        //if the current element is the keyData then assign the newNode nextField to the current Node next Field.
        //Next assign the current element next field to the newData and then assign the newData next
        //field to the temporary variable next field
        //return the newData node
        EmployeeNode newNode = new EmployeeNode(newData);
        EmployeeNode current = head;
        while(current != null){
            if(current.getData().equals(keyData)){
                break;
            }
            current = current.getNext();
        }

        if(current == null){
           return head;
        }


        newNode.setNext(current.getNext());
        current.setNext(newNode);

        return head;
    }
    public static EmployeeNode insertAtFront(EmployeeNode head,Employee e){
            EmployeeNode newNode=new EmployeeNode(e);
            newNode.setNext(head);
            return newNode;
    }


    public static void printList(EmployeeNode head){
        EmployeeNode current;
        current=head;
        while(current != null){
            System.out.println(current.getData().toString());
            current = current.getNext();
        }
        System.out.println("");
    }

    public static void main(String[] args) {

        //Creating an Employee Linked List
            Employee e1 = new Employee("Michael","FassBender",24,"Metallurgy");
            Employee e2 = new Employee("Charles","Xavier",35,"Physcology");
            Employee e3 = new Employee("Bruce","Banner",40,"Radiology");

            //Add items to the list by defining the head
            EmployeeNode head=new EmployeeNode(e1);
            EmployeeNode n2=new EmployeeNode(e2);
            head.setNext(n2);
            EmployeeNode n3 = new EmployeeNode(e3);
            head.getNext().setNext(n3);
            //print items of the LinkedList
        System.out.println("Default linked list");
            printList(head);
            Employee e4 = new Employee("Deshaun","Bridle",35,"Engineering");
            Employee e5 = new Employee("Bradley","Jameson",30,"Branding");

        System.out.println("After Adding an Employee: "+e4);
          head=insertAtFront(head,e4);
            printList(head);
        System.out.println("After adding another Employee:- "+e5);
           head = insertAtFront(head,e5);
            printList(head);

        Employee e6 = new Employee("Onyekwelu","Ifunanya",23,"Sports Development");
        insertAtPosition(head,3,e6);
        printList(head);

        Employee e7 = new Employee("Shada","Gbolade",39,"Engineering");
        insertLast(head,e7);
        printList(head);
        System.out.println(" Reverse single linked list");
        head = reverseLinkedList(head);
        printList(head);

    }
}
