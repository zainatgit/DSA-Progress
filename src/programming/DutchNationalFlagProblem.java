package programming;

/*
Input: {0, 1, 2, 0, 1, 2}
Output: {0, 0, 1, 1, 2, 2}

without using sorting algo
 */
public class DutchNationalFlagProblem {
    public static void main(String[] args) {
        int arr[] = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        //bruteForceApproach(arr);
        lowMidHigh(arr, arr.length);
        
    }

    private static void bruteForceApproach(int[] arr) {
        int result[] = new int[arr.length];
        int len = populateDigit(result,arr,0,0);
        len = populateDigit(result,arr,1,len);
        len = populateDigit(result,arr,2,len);
        for(int i=0; i<arr.length;i++){
            System.out.println(result[i]);
        }
    }

    private static int populateDigit(int[] result, int[] arr,int num, int len) {
        for(int i=0;i<arr.length;i++){
            if(arr[i] == num){
                result[len] = num;
                len++;
            }
        }
        return len;
    }

    static void lowMidHigh(int a[], int arr_size)
    {
        int lo = 0;
        int hi = arr_size - 1;
        int mid = 0, temp = 0;
        while (mid <= hi) {
            switch (a[mid]) {
                case 0: {
                    temp = a[lo];
                    a[lo] = a[mid];
                    a[mid] = temp;
                    lo++;
                    mid++;
                    break;
                }
                case 1:
                    mid++;
                    break;
                case 2: {
                    temp = a[mid];
                    a[mid] = a[hi];
                    a[hi] = temp;
                    hi--;
                    break;
                }
            }
        }
        for(int i=0; i<a.length;i++){
            System.out.println(a[i]);
        }

    }

}
