package com.javacode.datastructures.matrix;

import java.util.Arrays;

public class MatrixTranspose {


    static{

    }

    public static void main(String[] args) {

        int [][] sampleArray= {{1,3,5,2},{6,2,5,1},{9,1,1,5},{7,4,7,1}};
       // doMatrixTranspose(sampleArray);
        //Before
        System.out.println( "Before");
        for(int[]x: sampleArray){
            System.out.println(Arrays.toString(x));
        }

        System.out.println( "After");
        //After
        for(int[]x: doMatrixTranspose(sampleArray)){
            System.out.println(Arrays.toString(x));
        }
    }

    static int[][] doMatrixTranspose(int[][]a){


        var rows = a.length;
        var cols = a[0].length;

        for(var x=0;x < rows;x++){
            for(var y=x;y<cols;y++){
              var temp = a[x][y];
              a[x][y]=a[y][x];
              a[y][x]=temp;
            }
        }
        return a;
    }
}
