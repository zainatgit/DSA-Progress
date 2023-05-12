package programming.recurssion;

public class _3SumOfDigits {
    public static void main(String[] args) {
        int n = 2176;
        System.out.println(sumOfDigits(n));
    }

    private static int sumOfDigits(int n) {
        if(n == 0){
            return 0;
        }
        return sumOfDigits(n/10) + n%10;
    }
}
