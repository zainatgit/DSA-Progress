package programming.sortingAlgo;


public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {4,1,8,3,9,6,1,7};
        bubbleSort(arr);
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for(int a : arr){
            System.out.print(a+" ");
        }
        System.out.println();
    }

    private static void bubbleSort(int[] arr) {
        int temp;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    printArray(arr);
                }
            }
        }
    }
}
