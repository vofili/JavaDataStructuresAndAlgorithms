package com.javacode.datastructures.matrix;
import java.util.*;

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

    //

    //reverse the columns elements of a matrix

    static int[][] doMatrixColumnReverse(int[][] a){
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

        return a;
    }

    static int[][] doMatrixReverseColumn(int[][]arr){

        int row=arr.length;
        int col=arr[0].length;


        for(int c = 0; c < col;c++){
            for(int rTop = 0,rBot = row-1;rTop<rBot; rTop++,rBot--){
                int temp = arr[rTop][c];
                arr[rTop][c]=arr[rBot][c];
                arr[rBot][c]=temp;
            }
        }

        return arr;
    }


    //rotate a matrix counter clockwise


    static int[][] doCounterClockWiseRotate(int[][] arr){
        int[][]res=arr;
        if (arr == null) {

            throw new IllegalArgumentException("Input array cannot be null");
        }else{
            res = doMatrixTranspose(arr);
            res=doMatrixReverseColumn(res);


        }
        return res;
    }

    //to rotate matrix clockwise
    //change column to row
    //reverse each row

    static int[][] transposeColumnToRow(int[][]a){
        int row=a.length;
        int col = a[0].length;

        for(int c = 0; c < col;c++){
            for(int r = c; r < row; r++){
                int temp = a[r][c];
                a[r][c]=a[c][r];
                a[c][r]=temp;

            }
        }

        return a;
    }
    static int[][] doReverseMatrixByRow(int[][] a){
            int row=a.length;

            int cols=a[0].length;

            for(int r=0; r < row;r++){
                for(int cleft=0,cright=cols-1; cleft < cright; cleft++,cright--){
                    int temp = a[r][cleft];
                    a[r][cleft]= a[r][cright];

                    a[r][cright]=temp;
                }
            }
            return a;
    }


    //Transpose a matrix
    static int[][] doMatrixTranspose(int[][] a){
        int rows=a.length;
        int cols = a[0].length;

        for(int i = 0;i < rows;i++){
            System.out.println("Old Array row "+i+":"+Arrays.toString(a[i]));
            for(int j = i;j < cols;j++){
                int temp = a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
            System.out.println("New Array row "+i+":"+Arrays.toString(a[i]));
        }
        return a;
    }


        static List<Integer> findUniqueElements(int[][] arr){
                List<Integer>result=new ArrayList<>();
                Map<Integer,Integer> freq=new HashMap<>();
                int rows=arr.length;
                int cols = arr[0].length;
                for(int i = 0; i < rows;i++){
                    for(int j=0; j < cols;j++){
                        if(freq.containsKey(arr[i][j])){
                            freq.put(arr[i][j],freq.get(arr[i][j]).intValue()+1);
                        }else{
                            freq.put(arr[i][j],1);
                        }
                    }
                }

                for(Map.Entry<Integer,Integer> e: freq.entrySet()){
                    if(e.getValue()==1)
                    {
                        result.add(e.getKey());
                    }
                }



                return result;
        }







    public static void main(String[] args) {
        int[][] arr={{10,3,5,1,2,8},{9,27,5,7,7,1},{11,7,8,5,4,0},
                {1,3,5,23,4,7},{5,2,6,4,2,7},{3,2,8,19,1,7}};
        // doMatrixTransverse(arr);
        //  searchInAMatrix(arr, 11);
        //  doMatrixColumnReverse(arr);
        //   doMatrixSort(arr);

        int[][]ant={{1,2,3},{6,7,8},{9,3,6}};

        //Before
        System.out.println("Before"+"\\n");
        for(int[]p : arr){
            System.out.println(Arrays.toString(p));
        }
        int[][] sample = transposeColumnToRow(arr);
        //sample = doReverseMatrixByRow(sample);
       // int[][] sample = doMatrixTranspose(ant);
        System.out.println("After");
        for(int[]p:sample){
            System.out.println(Arrays.toString(p));
        }

        List<Integer>  res = findUniqueElements(arr);
        System.out.println(Arrays.toString(res.toArray()));

    }


}
