package com.javacode.datastructures.linkedlist;

public class EmployeeNode {

    Employee data;
    EmployeeNode next;

    public EmployeeNode(Employee data) {
        this.data = data;
        this.next = next;
    }

    public Employee getData() {
        return data;
    }
    public void setData(Employee data) {
        this.data = data;
    }

    public EmployeeNode getNext() {
        return next;
    }

    public void setNext(EmployeeNode next) {
        this.next = next;
    }


    public String toString(){
      return this.data.toString()+" :: "+this.next.getNext();
    }
}
