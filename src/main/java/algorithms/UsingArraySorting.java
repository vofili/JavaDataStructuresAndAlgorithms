package algorithms;

import java.util.*;


public class UsingArraySorting {

    static void doStringArraySort(String[] names){
        System.out.println("Before String Array Sort:- "+Arrays.toString(names));
        Arrays.sort(names);
        System.out.print("After String Array Sort:- "+Arrays.toString(names));
        System.out.printf("%s%n"," ");
        Arrays.sort(names,Collections.reverseOrder());
        System.out.printf("After Array reversal %s %n", Arrays.toString(names));
    }
    static void printArraySorting(int[] numArray){
        System.out.println("Before Array Sort :- "+Arrays.toString(numArray));
        Arrays.sort(numArray);
        System.out.println("After Array Sort :- "+Arrays.toString(numArray));
    }

    static void doPrintReverseArraySort(Integer[] numArray){

        System.out.println("Before Array Sort:- "+Arrays.toString(numArray));
        Arrays.sort((Integer[])numArray,Collections.reverseOrder());

        System.out.println("After Array Sort:- "+Arrays.toString(numArray));
    }

    static void doSubArraySort(Integer [] numArray, int startIndex,int endIndex){
        System.out.println("Before SubArray Sort:- "+Arrays.toString(numArray));
        Arrays.sort(numArray,startIndex, endIndex+1);
        System.out.println("After SubArray Sort:- "+Arrays.toString(numArray));
    }

    public static void main(String[] args) {
            Integer nums[]={23, 9, 1, 87, -4, 16, 82,45,100,5};

            doSubArraySort(nums, 1, 4);

            String[] classMates = {"Abiodun","Alade","Adelabu","David","Tolu","Prosper","Matthew",
                    "Junior","Freddie","Freddo","Fredd","Frodd"};
            doStringArraySort(classMates);

            Student s1 = new Student(1L,"Jameson","Johnson");
            Student s2 = new Student(2L,"Sarah","Connor");
            Student s3 = new Student(3L,"Michael","FassBender");
            Student s4 = new Student(4L,"Adele","Lorde");
        Student[] schoolStds = {s1,s2,s3,s4};
        Arrays.sort(schoolStds,new StudentComparator());
        System.out.println(Arrays.toString(schoolStds));
    }
}

class StudentComparator implements Comparator <Student>{

    public int compare(Student a, Student b){
        return a.firstName.compareTo(b.firstName);
    }
}

class Student{
    Long idNumber;
    String firstName,LastName;

    public Student(Long idNumber, String firstName, String lastName) {
        this.idNumber = idNumber;
        this.firstName = firstName;
        LastName = lastName;
    }

    public Long getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(Long idNumber) {
        this.idNumber = idNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "idNumber=" + idNumber +
                ", firstName='" + firstName + '\'' +
                ", LastName='" + LastName + '\'' +
                '}';
    }
}
