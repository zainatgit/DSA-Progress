package programming.sortingAlgo;


public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {4,1,8,3,9,6,1,7};
        insertionSort(arr);
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for(int a : arr){
            System.out.print(a+" ");
        }
        System.out.println();
    }

    private static void insertionSort(int[] arr) {
        for(int i=1;i<arr.length;i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && key<arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }

    }

// 1,4,8,3



























    /*

    private static void insertionSort(int[] arr) {
        for(int i=1;i<arr.length;i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && key<arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }

     */
}
