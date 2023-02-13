package programming.arrays;

public class BestTimeToBuyStock {
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        //bruteForce(arr);
        //auxillaryArraySoln(arr);
        mostOptimizedSoln(arr);
    }

    private static void mostOptimizedSoln(int[] arr) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        for(int i=0; i< arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
            if((arr[i] - min) > max){
                max = arr[i] - min;
            }
        }
        System.out.println(max);
    }

    private static void auxillaryArraySoln(int[] arr) {
        int[] auxArr = new int[arr.length];
            int max = Integer.MIN_VALUE;
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i] > max){
                max = arr[i];
            }
            auxArr[i] = max;
        }
        max = Integer.MIN_VALUE;
        for(int i=arr.length-1; i>=0; i--){
            int diff = auxArr[i] - arr[i];
            if(diff > max){
                max = diff;
            }
        }
        System.out.println(max);
    }


    static void bruteForce(int[] arr){
        int max = 0;
        int n = arr.length;
        int i=0;
        while(i<n-2){
            int num = arr[i];
            for(int j=i+1;j<n;j++){
                if(arr[j] - num > max){
                    max = arr[j] - num;
                }
            }
            i++;
        }
        System.out.println(max);
    }
}
