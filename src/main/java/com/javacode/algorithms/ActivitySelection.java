package com.javacode.algorithms;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Find the minimum number of activities that can be started without overlapping into other activities
 * perform this implementation using Greedy algorithm
 */
public class ActivitySelection
{

    static Activity[] getMaximumActivity(Activity[] arr){

        Activity[] res=new Activity[arr.length];
        //sort the activites in ascending order of their finishing times.
        Arrays.sort(arr,new Comparator<Activity>()  {
                public int compare(Activity a1, Activity a2){
                    return a1.getEnd() - a2.getEnd();
                }
        });

        //include the first activity as part of the optimal solution since the first activity would always be started.
       int i = 0;
       res[0]=arr[i];
       for(int j = 1; j < arr.length;j++){
           if(arr[j].getStart() >= arr[i].getEnd()){
               res[++i]=arr[j];
                i = j;
           }
       }
       return res;
    }


    public static void main(String[] args) {
        //create somme activities
        Activity a1 = new Activity(1,3);
        Activity a6 = new Activity(4,8);
        Activity a2 = new Activity(3,4);
        Activity a3 = new Activity(1,4);
        Activity a5 = new Activity(2,7);
        Activity a4 = new Activity(3,6);

        Activity[] myArr = {a1,a2,a3,a4,a5,a6};

        //Create another activity array

        Activity arr[] = new Activity[6];

        arr[0] = new Activity(5, 9);
        arr[1] = new Activity(1, 2);
        arr[2] = new Activity(3, 4);
        arr[3] = new Activity(0, 6);
        arr[4] = new Activity(5, 7);
        arr[5] = new Activity(8, 9);

        System.out.println(Arrays.toString(getMaximumActivity(arr)));
    }
}

class Activity{
    private Integer start;
    private Integer end;

    public Activity(Integer start, Integer end) {
        this.start = start;
        this.end = end;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getEnd() {
        return end;
    }

    public void setEnd(Integer end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}