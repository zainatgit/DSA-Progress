package programming.arrays.matrix;

import java.util.Arrays;
import java.util.HashSet;

/*
https://leetcode.com/problems/set-matrix-zeroes/

Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
Output: [[1,0,1],[0,0,0],[1,0,1]]
 */
public class SetZeroMatrix {
    public static void main(String[] args) {
       int[][] arr= {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        int r = arr.length;
        int c = arr[0].length;
        //bruteForceSoln(arr, r, c);//Using HashSet and extra 2d array
        //inPlaceSoln(arr, r, c); //Using HashSet and no extra 2d array
        moreOptimizedSoln(arr, r, c); //Without using HashSet

    }

    private static void moreOptimizedSoln(int[][] arr, int r, int c) {
        for (int i = 0; i< r; i++){
            for (int j = 0; j< c; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("------------------");

        //Create new 2D array
        //int[][] newArr = new int[r][c];
        HashSet<Integer> colZeroHs = new HashSet<>();

        for (int i = 0; i< r; i++){
            for (int j = 0; j< c; j++){
                if(arr[i][j]==0){
                    int zeroRow[] = new int[c];
                    arr[i] = zeroRow;
                    colZeroHs.add(j);
                    break;
                }
                if(colZeroHs.contains(j)){
                    arr[i][j] = 0;
                }
            }
        }


        for (int i = 0; i< r; i++){
            for (int j = 0; j< c; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static void makeColZero(int[][] arr, int col, int rowNum){
        for(int i=0;i<rowNum;i++){
            arr[i][col] = 0;
        }
    }
    private static void inPlaceSoln(int[][] arr, int r, int c) {
        for (int i = 0; i< r; i++){
            for (int j = 0; j< c; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("------------------");
        HashSet<Integer> rowZeroHs = new HashSet<>();
        HashSet<Integer> colZeroHs = new HashSet<>();

        //Find zeroHashsets
        for (int i = 0; i< r; i++){
            for (int j = 0; j< c; j++){
                if(arr[i][j] == 0){
                    rowZeroHs.add(i);
                    colZeroHs.add(j);
                }
            }
        }
        //Create new 2D array
        //int[][] newArr = new int[r][c];

        for (int i = 0; i< r; i++){
            for (int j = 0; j< c; j++){
                if(rowZeroHs.contains(i)){
                    int zeroRow[] = new int[c];
                    arr[i] = zeroRow;
                    break;
                }else if (colZeroHs.contains(j)) {
                    arr[i][j] = 0;
                }
            }
        }


        for (int i = 0; i< r; i++){
            for (int j = 0; j< c; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static void bruteForceSoln(int[][] arr, int r, int c) {
        for (int i = 0; i< r; i++){
            for (int j = 0; j< c; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("------------------");
        HashSet<Integer> rowZeroHs = new HashSet<>();
        HashSet<Integer> colZeroHs = new HashSet<>();

        //Find zeroHashsets
        for (int i = 0; i< r; i++){
            for (int j = 0; j< c; j++){
                if(arr[i][j] == 0){
                    rowZeroHs.add(i);
                    colZeroHs.add(j);
                }
            }
        }
        //Create new 2D array
        int[][] newArr = new int[r][c];

        for (int i = 0; i< r; i++){
            for (int j = 0; j< c; j++){
                if(rowZeroHs.contains(i)){
                    int zeroRow[] = new int[c];
                    newArr[i] = zeroRow;
                    break;
                }else if (colZeroHs.contains(j)) {
                    newArr[i][j] = 0;
                }else{
                    newArr[i][j] = arr[i][j];
                }
            }
        }


        for (int i = 0; i< r; i++){
            for (int j = 0; j< c; j++){
                System.out.print(newArr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
