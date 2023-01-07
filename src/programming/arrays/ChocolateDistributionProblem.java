package programming.arrays;

import java.util.Arrays;

public class ChocolateDistributionProblem {
    public static void main(String[] args) {
        int arr[] = {7, 3, 2, 4, 9, 12, 56};
        int m = 3;
        Arrays.sort(arr);
        int minDif = Integer.MAX_VALUE;
        for(int i=0; (m-1+i)< arr.length; i++){
            if(arr[m-1+i] - arr[i] < minDif){
                minDif = arr[m-1] - arr[i];
            }
        }
        System.out.println(minDif);
    }
}
