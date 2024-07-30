package programming.sortingAlgo;

import java.util.ArrayList;
import java.util.List;

public class MergeSortStriver {
    public static void main(String[] args) {
        int arr[] = {5,2,6,1};
        mergeSort(arr,0,arr.length-1);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    private static void mergeSort(int[] arr, int low, int high) {
        if(low>=high) return;
        int mid = (low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }

    private static void merge(int[] arr,int low, int mid, int high) {
        int l = low;
        int r = mid+1;
        int[] temp = new int[high-low+1];
        int count=0;
        while(l<=mid && r<=high){
            if(arr[l] < arr[r]){
                temp[count++]=arr[l];
                l++;
            }else{
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
