package programming.sortingAlgo;


public class QuickSort {
    public static void main(String[] args) {
        int arr[] = {4,1,8,3,9,6,1,7};
        quickSort(arr,0,arr.length-1);
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for(int a : arr){
            System.out.print(a+" ");
        }
        System.out.println();
    }

    private static void quickSort(int[] arr,int l, int r) {
        if(l<r){
            int partitionIndex = partitionLogic(arr,l,r);
            quickSort(arr,l,partitionIndex-1);
            quickSort(arr,partitionIndex+1,r);
        }
    }

    private static int partitionLogic(int arr[], int l, int r) {
        int pivot = arr[l];
        int i = l;
        int j = r;
        while(i<j){
            while(arr[i] <= pivot && i<r) i++;
            while(arr[j] > pivot) j--;
            if(i<j)
                swap(arr,i,j);
            }
        swap(arr,l,j);
        return j;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
