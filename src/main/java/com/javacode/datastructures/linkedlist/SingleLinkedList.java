package com.javacode.datastructures.linkedlist;

public class SingleLinkedList {


    public static void main(String[] args) {

    }
    class Node {
        private String name;
        private Node next;

        @Override
        public String toString() {
            return "Node{" +
                    "name='" + name + '\'' +
                    ", next=" + next +
                    '}';
        }

        public Node(Node next, String name) {
            this.next = next;
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

}