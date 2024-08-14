package com.javacode.algorithms;


/**
 *
 * HashTable backed by an array
 *
 */
public class SimpleHashTable {
    private Employee[] hashTable;

    public SimpleHashTable() {
        this.hashTable = new Employee[10];
    }

    private int hashKey(String key){
        return key.length() %  this.hashTable.length;
    }

    public void put(String key, Employee value){
        int hashKey = hashKey(key);

        if(hashTable[hashKey]!= null){
            System.out.println("Error, key "+hashKey+" already contains a value ");
        }else{
            hashTable[hashKey]=value;
        }
    }

    public Employee get(String key){
        int hashedKey = hashKey(key);
        return hashTable[hashedKey];
    }

    public void printHashTable(){
        for(Employee e: hashTable){
            System.out.println(e);
        }
    }


    public static void main(String[] args) {
        Employee e1 = new Employee("James","Jones",1997);
        Employee e2 = new Employee("John","Doe", 1996);
        Employee e3 = new Employee("Wade","Wilson", 1999);
        Employee e4 = new Employee("Sarah", "Johnson", 1998);
        Employee e5 = new Employee("Alice","Anita",1995);
        SimpleHashTable sht = new SimpleHashTable();
        sht.put("Jones",e1);
        sht.put("Doe",e2);
        sht.put("Wilson",e3);
        sht.put("Johnson",e4);
        sht.put("Anita",e5);

        sht.printHashTable();
    }
}


class Employee{
    String firstName;
    String lastName;
    int employeeId;

    public Employee(String firstName, String lastName, int employeeId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeId = employeeId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", employeeId=" + employeeId +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
}