package programming.sortingAlgo;


public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {4,1,8,3,9,6,1,7};
        selectionSort(arr);
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for(int a : arr){
            System.out.print(a+" ");
        }
        System.out.println();
    }

    private static void selectionSort(int[] arr) {
        int minIndex = 0;
        int temp;
        for(int i=0;i<arr.length;i++){
            int min = Integer.MAX_VALUE;
            for(int j=i;j<arr.length;j++){
                if(arr[j]<min){
                    minIndex = j;
                    min = arr[j];
                }
            }
            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
