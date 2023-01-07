package programming;


/*
Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
Output: -12 -13 -5 -7 -3 -6 11 6 5
 */
public class NegativeNumberToLeft {
    public static void main(String[] args) {
        int arr[] = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        int result[] = new int[arr.length];
        int pos= 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0) {
                result[pos] = arr[i];
                pos++;
            }
        }
        for(int j=0; j< arr.length;j++){
            if(arr[j]>=0) {
                result[pos] = arr[j];
                pos++;
            }
        }
        for (int i=0; i< arr.length;i++){
            System.out.println(result[i]);
        }
    }
}
