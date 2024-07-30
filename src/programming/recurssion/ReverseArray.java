package programming.recurssion;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        reverseArray(arr,0,arr.length-1);
        Arrays.stream(arr).forEach(System.out::print);
    }

    private static void reverseArray(int[] arr,int l,int r) {
        if(l>=r) return;
        swap(arr,l,r);
        reverseArray(arr,l+1,r-1);
    }

    private static void swap(int[] arr, int l, int r) {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }

}
