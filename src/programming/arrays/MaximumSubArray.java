package programming.arrays;
/*
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.

Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
 */
public class MaximumSubArray {
    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        //bruteForceSolution(arr);
        //slidingWindowSolution(arr);
        kadaneAlgorithm(arr);
    }

    private static void kadaneAlgorithm(int[] arr) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0; i< arr.length; i++){
            sum+=arr[i];
            if(sum > max) max = sum;
            if(sum < 0) sum = 0;
        }
        System.out.println(max);
    }

    private static void bruteForceSolution(int[] arr) {
        int k = 0;
        int len = arr.length;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        while(k<len){
            for(int j=0; j<len-k; j++){
                sum = 0;
                for(int i=j; i<=j+k; i++){
                    sum+=arr[i];
                }
                if(sum > max) max = sum;
            }
            k++;
        }
        System.out.println(max);
    }

    private static void slidingWindowSolution(int[] arr) {
        int k=1;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int len = arr.length;
        while(k < len){
            sum = slidingSum(arr,k);
            for(int i=k; i<len; i++){
                if(sum > max) max = sum;
                sum+=arr[i];
                sum-=arr[i-k];
            }
            if(sum > max) max = sum;
            k++;
        }
        sum = slidingSum(arr,k);
        if(sum > max) max = sum;
        System.out.println(max);
    }

    private static int slidingSum(int[] arr, int k) {
        int sum = 0;
        for(int i=0; i<k; i++){
            sum+=arr[i];
        }
        return sum;
    }
}
