package programming.sortingAlgo;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {4,1,8,5,2,9};
        mergeSort(arr,0,arr.length-1);
        System.out.println(arr);
    }

    private static void mergeSort(int[] arr, int l, int r) {
        if(l<r){
            int mid = (l+r)/2;
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);
            merge(arr,l,mid,r);
        }
    }

    private static void merge(int[] arr, int l, int mid, int r) {
        int b[] = new int[arr.length];
        int i = l;
        int j = mid+1;
        int k = l;
        while(i<=mid && j>mid){
            if(arr[i] < arr[j]){
                b[k] = arr[i];
                i++;
            }else{
                b[k] = arr[j];
                j++;
            }
            k++;
        }
        if(i>mid){
            while(j>mid) {
                b[k] = arr[j];
                j++;k++;
            }
        }else{
            while(i<=mid){
                b[k] = arr[i];
                i++;k++;
            }
        }
        for(int p=l;p<=r;p++){
            arr[p] = b[p];
        }

    }
}
