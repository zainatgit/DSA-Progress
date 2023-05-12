package programming.recurssion;

public class _1SumOfNumbersFromOneToN {
    public static void main(String[] args) {
        System.out.println(sum(10));
    }

    static int sum(int n){
        if(n==0) return 0;
        return  sum(n-1) + n;
    }
}
