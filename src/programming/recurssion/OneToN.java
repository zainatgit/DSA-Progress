package programming.recurssion;

public class OneToN {
    public static void main(String[] args) {
        int c=1;
        int n=10;
        recursive(c,n);
    }

    private static void recursive(int c,int n) {
        System.out.println(c);
        c++;
        if(c>n) return;
        recursive(c,n);
    }
}
