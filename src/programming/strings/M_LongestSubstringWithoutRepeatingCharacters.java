package programming.strings;

import java.util.HashMap;
import java.util.Map;

public class M_LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String str = "pwwkew";
        int pointer = 0;
        int max = 0;
        while(pointer < str.length()){
            Map<Character,Integer> hm = new HashMap<>();
            for(int i=pointer;i<str.length();i++){
                if(hm.containsKey(str.charAt(i))){
                    int idx = hm.get(str.charAt(i));
                    pointer = i+1;
                    break;
                }else{
                    hm.put(str.charAt(i),i);
                    max = Math.max(max,hm.size());
                    pointer++;
                }
            }
        }
        System.out.println(max);
    }
}
