package programming.recurssion;

public class CheckPalindrome {
    public static void main(String[] args) {
        String str = "detartrated";
        checkPalindrome(str);
    }

    private static void checkPalindrome(String str) {
        if(str.length() < 2) {
            System.out.println(true);
            return;
        }
        if(str.charAt(0) != str.charAt(str.length()-1)) {
            System.out.println(false);
            return;
        }
        checkPalindrome(str.substring(1,str.length()-1));
    }
}
