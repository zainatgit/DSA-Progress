package programming.recurssion;

public class PrintNtoOneUsingBacktracking {
    public static void main(String[] args) {
        int c=1;
        int n=5;
        recursivceMethod(c,n);
    }

    private static void recursivceMethod(int c, int n) {
        if(c>n) return;
        recursivceMethod(c+1,n);
        System.out.println(c);
    }
}
