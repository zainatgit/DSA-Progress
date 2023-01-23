package programming.arrays;

public class NegativeNumberToOneSide {
    public static void main(String[] args) {
        int arr[] = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
        shiftingToRight(arr);
    }

    private static void shiftingToRight(int[] arr) {
        int next = 0;
        for(int pos=0; pos<arr.length;pos++){
            if(pos>0){
                next = pos+1;
                while(next<arr.length){
                    if(arr[next] < 0) {
                        swap(arr, pos, next);
                        break;
                    }
                    next++;
                }
            }
        }

        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
    }

    private static void swap(int[] arr, int pos, int next) {
        int neg = arr[next];
        int temp;
        while(next > pos){
            arr[next] = arr[next-1];
            next--;
        }
        arr[next] = neg;
    }
}
