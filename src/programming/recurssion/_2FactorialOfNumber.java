package programming.recurssion;

public class _2FactorialOfNumber {
    public static void main(String[] args) {
        System.out.println(factorial(3));
    }

    private static int factorial(int i) {
        if(i==1){
            return i;
        }
        return factorial(i-1) * i;
    }
}
