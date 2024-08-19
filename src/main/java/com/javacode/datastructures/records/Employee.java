package com.javacode.datastructures.records;

import java.util.Objects;

public class Employee {

    String firstName,lastName;
    Long empId;

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

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public int hashCode(){
        return Objects.hash(firstName,lastName,empId);
    }

    @Override
    public boolean equals(Object obj){

            if(!(obj instanceof Employee)){
                return false;
            }
            if(obj == this) {
                return true;
            }
                Employee other= (Employee)obj;
                if(this.empId==other.empId && this.getFirstName()==other.getFirstName() && this.getLastName()==other.getLastName()){
                    return true;
                }

          return false;
    }
    public String toString(){
            return this.firstName+"->"+this.getLastName();
    }


}
