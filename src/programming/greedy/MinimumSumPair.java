package programming.greedy;

import java.util.Arrays;

/*
Input: [6, 8, 4, 5, 2, 3]
Output: 604
The minimum sum is formed by numbers
358 and 246

Input: [5, 3, 0, 7, 4]
Output: 82
The minimum sum is formed by numbers
35 and 047
 */
public class MinimumSumPair {
    public static void main(String[] args) {
        //int arr[] = {6, 8, 4, 5, 2, 3};
        int arr[] = {5, 3, 0, 7, 4};
        System.out.println(findMinimumSum(arr));
    }

    //choosing long bcz large strings cannot be parset using Integer.parseInt()
    private static long findMinimumSum(int[] arr) {
        Arrays.sort(arr);
        String first = "0";
        String second = "0";
        for(int i = 0; i< arr.length;i++){
            if(i%2 == 0){
                first+=arr[i];
            }else{
                second+=arr[i];
            }
        }
        return Long.parseLong(first) + Long.parseLong(second);
    }
}
