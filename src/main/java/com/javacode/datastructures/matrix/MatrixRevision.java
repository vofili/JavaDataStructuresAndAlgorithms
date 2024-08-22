package com.javacode.datastructures.matrix;

import java.util.Arrays;

public class MatrixRevision {


    //for an nxn matrix perform a rotation counter clockwise
    //transpose the matrix
    //reverse each column
static int[][] doMatrixTranspose(int[][] arr){
   int rows = arr.length;
   int cols = arr[0].length;

    for(int i = 0; i < rows; i++){
        for(int j = i; j < cols;j++){
            int temp = arr[i][j];
            arr[i][j]=arr[j][i];
            arr[j][i]=temp;
        }
    }


    return arr;
}


    static int[][] doMatrixReverseRow(int[][] arr){
                int rows=arr.length;
                int cols = arr[0].length;
                for(int i = 0;i < rows;i++){
                    for(int j = 0; j < cols/2;j++){
                        int temp=arr[i][j];
                        arr[i][j]=arr[i][cols-1-j];
                        arr[i][cols-1-j]=temp;
                    }
                }
                return arr;
    }

    public static void main(String[] args) {
        int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
       // int [][]x = doMatrixTranspose(a);
        int [][]y=doMatrixReverseRow(a);
        for(int[] i:y){
            System.out.println(Arrays.toString(i));
        }
    }

    static int[][] doMatrixRotation(int[][] x){


        return x;
    }
}
