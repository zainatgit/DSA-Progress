package programming.arrays;

import java.util.ArrayList;
import java.util.List;

public class InversionCountLCMergeSort {
    public static void main(String[] args) {
        int arr[] = {5,2,6,1};
        List<Integer> result = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            result.add(0);
        }
        mergeSort(arr,0,arr.length-1,result);
        for (int i=0;i<arr.length;i++){
            System.out.print(result.get(i));
        }
    }

    private static void mergeSort(int[] arr, int low, int high,List<Integer> result) {
        if(low>=high) return;
        int mid = (low+high)/2;
        mergeSort(arr,low,mid,result);
        mergeSort(arr,mid+1,high,result);
        merge(arr,low,mid,high,result);
    }

    private static void merge(int[] arr,int low, int mid, int high,List<Integer> result) {
        int l = low;
        int r = mid+1;
        int[] temp = new int[high-low+1];
        int count=0;
        while(l<=mid && r<=high){
            if(arr[l] < arr[r]){
                temp[count++]=arr[l];
                l++;
            }else{
                int val = result.get(l);
                val++;
                result.remove(l);
                result.add(l,val);
                temp[count++] = arr[r];
                r++;
            }
        }
        while(l<=mid){
            temp[count++] = (arr[l]);
            l++;
        }
        while(r<=high){
            temp[count++] = (arr[r]);
            r++;
        }

        for(int i=low;i<=high;i++){
            arr[i] = temp[(i-low)];
        }
    }




}
