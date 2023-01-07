package programming.sortingAndSearching;

/*
Input:
n1 = 6; A = {1, 5, 10, 20, 40, 80}
n2 = 5; B = {6, 7, 20, 80, 100}
n3 = 8; C = {3, 4, 15, 20, 30, 70, 80, 120}
Output: 20 80
Explanation: 20 and 80 are the only
common elements in A, B and C.
 */

import java.util.*;

public class CommonElementsIn3Arrays {
    public static void main(String[] args) {
        int A[] = {1, 5, 10, 20, 40, 80};
        int B[] = {6, 7, 20, 80, 100};
        int C[] = {3, 4, 15, 20, 30, 70, 80, 120};
        Set<Integer> integerSet = new LinkedHashSet<>();
        for(int i=0; i<A.length; i++){
            boolean found1 = false;
            boolean found2 = false;
            int num = A[i];
            //look for num in first array
            int high1 = B.length-1;
            int low1 = 0;
            int mid1;
            while(low1<=high1){
                mid1= low1 + (high1-low1)/2;
                if(B[mid1] == num) {
                    found1 = true;
                    break;
                }
                if(B[low1] <= num && B[mid1] > num){
                    high1 = mid1 - 1;
                }else{
                    low1 = mid1+1;
                }
            }
            //look for num in second array
            int high2 = C.length-1;
            int low2 = 0;
            int mid2;
            while(low2<=high2){
                mid2= low2 + (high2-low2)/2;
                if(C[mid2] == num) {
                    found2 = true;
                    break;
                }
                if(C[low2] <= num && C[mid2] > num){
                    high2 = mid2 - 1;
                }else{
                    low2 = mid2+1;
                }
            }

            if(found1 && found2){
                integerSet.add(num);
            }
        }
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        /*integerArrayList.addAll(integerSet);
        Collections.reverse(integerArrayList);*/
        integerSet.forEach(e-> System.out.println(e));
    }


}
