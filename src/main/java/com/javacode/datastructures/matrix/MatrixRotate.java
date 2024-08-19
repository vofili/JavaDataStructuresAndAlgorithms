package com.javacode.datastructures.matrix;

public class MatrixRotate {

    static int[][] reverseColumnMatrix(int[][] a){

        return a;
    }

    static int[][]transposeMatrix(int[][] x){
        return x;
    }
    static int[][] rotateMatrix(int[][] arr){
               arr= transposeMatrix(arr);
               arr= reverseColumnMatrix(arr);

               return arr;
    }
}
