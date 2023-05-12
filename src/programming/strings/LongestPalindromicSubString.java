package programming.strings;

public class LongestPalindromicSubString {
    public static void main(String[] args) {
        String str = "babad";
        System.out.println(naiveApproach(str));
    }

    private static String naiveApproach(String str) {
        String LongestPal = String.valueOf(str.charAt(0));
        String pal = "";
        boolean found = false;
        for(int i=0; i<str.length()-1 && str.length()-i > LongestPal.length() ;i++){
            int ch = str.charAt(i);

            for(int j=i+1;j<str.length();j++){
                if(j>str.length() && !found){
                    break;
                }
                if(ch == str.charAt(j)){
                    pal = findPal(str,i,j);
                    if(pal.length() > LongestPal.length()){
                        LongestPal = pal;
                        found = true;
                    }
                }
            }
        }
        return LongestPal;
    }

    private static String findPal(String str, int i, int j) {
        String subStr = str.substring(i,j+1);
        String revSubStr = "";
        for(int k=subStr.length()-1;k>=0;k--){
            revSubStr+=subStr.charAt(k);
        }
        if (revSubStr.equals(subStr)){
            return subStr;
        }
        else{
            return "";
        }
    }
}
