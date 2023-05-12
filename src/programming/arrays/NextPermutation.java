package programming.arrays;

import java.util.Arrays;

import static programming.arrays.KthLargest.swap;

/*
A permutation of an array of integers is an arrangement of its members into a sequence or linear order.

For example, for arr = [1,2,3], the following are all the permutations of arr: [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].
For example, the next permutation of arr = [1,2,3] is [1,3,2].
Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
 */
public class NextPermutation {
    public static void main(String[] args) {
        int arr[] = {2,4,1,7,5,0};
        //bruteForce(arr); Brute force soln is to find all permutations and return the one after given input
        bestSoln(arr);
    }

    private static void bestSoln(int[] arr) {

        int n = arr.length;
        int i,j;

        //find pivot
        for(i=n-2;i>=0;i--){
            if(arr[i] < arr[i+1]){
                break;
            }
        }

        //if pivot is not there then i<0, case of greatest number, we just return the reverse of it
        if(i<0){
            reverse(arr,0,n-1);
        }else{
            //find successor
            for(j=n-1;j>1;j--){
                if(arr[i]<arr[j]){
                    break;
                }
            }

            //swap successor and pivot
            swap(arr,i,j);

            //reverse suffix
            reverse(arr,i+1,n-1);

        }
        Arrays.stream(arr).forEach(e-> System.out.print(e+" "));


    }

    private static void reverse(int[] arr, int start, int end) {
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
}
