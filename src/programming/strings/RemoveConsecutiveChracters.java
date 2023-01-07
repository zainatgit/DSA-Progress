package programming.strings;

public class RemoveConsecutiveChracters {
    public static void main(String[] args) {
        String str = "aaabaa";
        String result = "";
        for (int i =0; i<str.length(); i++){
            char ch = str.charAt(i);
            result+=ch;
            if(i+1<str.length() && (str.charAt(i+1) == ch)){
                result = result.substring(0,result.length()-1);
            }
        }
        System.out.println(result);
    }
}
