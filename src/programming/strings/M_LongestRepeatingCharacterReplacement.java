package programming.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

//https://leetcode.com/problems/longest-repeating-character-replacement/
public class M_LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        String str = "AABABBA";
        int k = 1;
        bruteForceSoln(k,str);

    }

    private static void bruteForceSoln(int k, String str) {
        int maxLength = 0;
        for(int i=0; i<str.length();i++){
            char ch = str.charAt(i);
            int max = findMax(str,ch,i,k);
            maxLength = Math.max(maxLength,max);
        }
        System.out.println(maxLength);
    }

    private static int findMax(String str, char ch, int i, int k) {
        int longestSeq = 1;
        List<Character> list = new ArrayList<>();
        list.add(ch);
        for (int j = i+1;j<str.length();j++){
            if(list.contains(str.charAt(j))){
                longestSeq++;
            }else{
                list.add(str.charAt(j));
                k--;longestSeq++;
            }
            if(k<0){
                longestSeq--;
                list.remove(j);
                return longestSeq;
            }
        }
        return longestSeq;
    }
}
