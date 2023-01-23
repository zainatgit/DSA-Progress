package programming.greedy;

public class MinimumNoOfCoins {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 10, 20, 50, 100, 500, 1000};
        int value = 121;
        System.out.println(findMinimumCoins(arr,value));
    }

    private static int findMinimumCoins(int[] arr, int value) {
        int coins = 0;
        for(int i= arr.length-1;i>=0;i--){
            if(value/arr[i] > 0 || (value/arr[i] == 0 &&  value % arr[i] == 0)){
                coins = coins + (value/arr[i]);
                value = value%arr[i];
            }
        }
        return coins;
    }
}
