package programming.arrays;

public class KthLargest {
    public static void main(String[] args) {
        int arr[] = {-1,2,0};
        int k = 2;
        System.out.println(findKthLargest(arr,2));
    }
    public static int findKthLargest(int[] nums, int k) {
        int smallest = nums.length-k+1;
        return quickSelect(nums,0,nums.length-1,smallest);
    }

    public static int quickSelect(int[] arr,int l, int r, int smallest){
            int pivotIdx = partitionLogic(arr,l,r);
            if(pivotIdx+1==smallest){
                return arr[pivotIdx];
            }else if(pivotIdx+1<smallest){
                return quickSelect(arr,pivotIdx+1,r,smallest);
            }else{
                return quickSelect(arr,l,pivotIdx-1,smallest);
            }
    }

    public static int partitionLogic(int[] arr,int l, int r){
        int pivot = arr[l];
        int i = l;
        int j = r;
        while(i<j){
            while(arr[i] <= pivot && i<r) i++;
            while(arr[j] > pivot) j--;
            if(i<j){
                swap(arr,i,j);
            }
        }
        swap(arr,l,j);
        return j;
    }

    public static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
