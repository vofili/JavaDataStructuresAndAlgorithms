package com.javacode.datastructures.matrix;
import java.util.Arrays;
public class MatrixOperations {

    //transverse a matrix
    static void doMatrixTransverse(int[][]matrixArray){

        int rows = matrixArray.length;
        int cols = matrixArray[0].length;
        for(int x=0;x < rows;x++){
            System.out.println("value of x: "+x);
            for( int y = 0; y < cols;y++){
                System.out.println("value of y: "+y);
              //  System.out.printf("Matrix Array item on Row: %d Column: %d% %d %n",x+1,y+1,matrixArray[x][y]);
                System.out.println("Row: "+(x+1)+" Column: "+(y+1)+" := "+matrixArray[x][y]);
            }
        }

    }

    //search in a matrix
    public static void searchInAMatrix(int[][] arr, int searchItem){

        int rows = arr.length;
        int cols = arr[0].length;

        System.out.printf("Rows:%d Columns: %d %n",rows,cols);

        //
        for(int x =0; x < rows;x++){
            for (int y=0;y < cols;y++){
                if(arr[x][y] == searchItem) {
                    System.out.printf("Item %d, found in the matrix array at row %d and column %d", searchItem, x + 1, y + 1);
                    return;
                }
            }
        }
        System.out.printf("Item %d not found!",searchItem);
    }



    static void doMatrixSort(int[][] mArray){

        //rowwise sort of an array
        int rows=mArray.length;
        int cols = mArray[0].length;
        System.out.println("Before row-wise Array Sort");
        for(int[] x: mArray){
            System.out.println(Arrays.toString(x));
        }

        for(int x=0; x < rows;x++){
            Arrays.sort(mArray[x]);
        }

        System.out.println("AAfter Row-wise Array Sort");
        for(int[]b:mArray){
            System.out.println(Arrays.toString(b));
        }

    }
    //transpose a matrix

    //reverse the columns elements of a matrix

    static void doMatrixColumnReverse(int[][] a){
        int rows = a.length;
        int cols = a[0].length;

        System.out.println("Array elements before Reversal");
        for(int[]p:a){
            System.out.println(Arrays.toString(p));
        }
        for(int i = 0;i < cols;i++){
           // System.out.println("Column "+i);
            for(int j=0, k= rows -1 ;j < k;j++,k--){
              //  System.out.println("upper Row:"+j+ " Lower Row:"+k);

                int t = a[j][i];
                a[j][i] = a[k][i];
                a[k][i]=t;
            }
        }
        System.out.println("Array elements after Reversal");
        for(int[]p:a){
            System.out.println(Arrays.toString(p));
        }
    }

    public static void main(String[] args) {
        int[][] arr={{10,3,5,1,2,8},{9,2,5,7,7,1},{11,7,8,9,1,7}};
       // doMatrixTransverse(arr);

      //  searchInAMatrix(arr, 11);
        doMatrixColumnReverse(arr);
         //   doMatrixSort(arr);
    }


}
