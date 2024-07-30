package programming.recurssion;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 7;// no of elements in fibo series
        //System.out.print(0+" "+1+" ");
        //loopFibonacci(n);
        //System.out.println(recursiveFib(n));
        List<Integer> output = new ArrayList<>();
        output.add(1);
        output.add(1);
        output.add(1);
        output.add(1);

        System.out.println(output.stream().mapToInt(Integer::intValue).sum());

    }

    private static int recursiveFib(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        return recursiveFib(n-1) + recursiveFib(n-2);
    }

    private static void loopFibonacci(int n) {
        int first = 1;
        int second = 0;
        int sum = 0;
        for(int i=2;i<=n;i++){
            sum = first+second;
            System.out.print(sum+" ");
            second = first;
            first = sum;
        }
    }
}
