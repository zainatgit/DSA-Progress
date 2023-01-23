package programming.strings;

public class IsomorphicStrings {
    public static void main(String[] args) {
        String s = "foo";
        String t = "bar";
        System.out.println(isIsomorphic(s,t));
    }
    public static boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        for(int i=0; i<s.length();i++){
            s = s.replaceAll(String.valueOf(s.charAt(i)),String.valueOf(t.charAt(i)));
        }
        System.out.println(s+" "+t);
        if(s.equals(t)){
            return true;
        }else{
            return false;
        }

    }
}
