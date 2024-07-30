package programming.arrays;

import java.util.Arrays;

public class RepeatingAndMissingNumber {
    public static void main(String[] args) {
        int arr[] = {4,3,6,2,1,1};
        int n = arr.length;
        int Sn = (n*(n+1))/2;
        int S = Arrays.stream(arr).sum();
        int eq1 = S-Sn;
        int Pn = (n*(n+1)*(2*n+1))/6;
        int P = Arrays.stream(arr).map(e -> e*e).sum();
        int eq2 = P - Pn;
        int x = ((eq1*eq1 + eq2)/eq1)/2;
        int y = x-eq1;
        System.out.println("Repeating num : "+x);
        System.out.println("Missing num : "+y);

    }
}
