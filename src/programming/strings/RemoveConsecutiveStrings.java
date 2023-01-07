package programming.strings;

import java.util.Stack;

/*
You are given a string s consisting of lowercase English letters. A duplicate removal consists of choosing two adjacent and equal letters and removing them.

We repeatedly make duplicate removals on s until we no longer can.

Return the final string after all such duplicate removals have been made. It can be proven that the answer is unique.

Example 1:

Input: s = "abbaca"
Output: "ca"
Explanation:
For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal, and this is the only possible move.  The result of this move is that the string is "aaca", of which only "aa" is possible, so the final string is "ca".
Example 2:

Input: s = "azxxzy"
Output: "ay"

Constraints:

1 <= s.length <= 105
s consists of lowercase English letters.
 */
public class RemoveConsecutiveStrings {
    public static void main(String[] args) {
        String str = "abbaca";
        //bruteForceApproach(str); //Getting TLE for 2 out of 106 test cases O(n*n) complexity
        usingStack(str);

    }

    private static void usingStack(String str) {
        Stack<Character> stc = new Stack<>();
        for(Character ch : str.toCharArray()){
            if(!stc.isEmpty() && stc.peek() == ch){
                stc.pop();
            }else{
                stc.push(ch);
            }
        }
        String result = "";
        while (!stc.isEmpty()){
            result= stc.pop()+result;
        }
        System.out.println(result);
    }

    private static void bruteForceApproach(String str) {
        boolean onceMore = false;
        do{
            String result = "";
            onceMore = false;
            for (int i =0; i<str.length(); i++){
                char ch = str.charAt(i);
                result+=ch;
                if(i+1<str.length() && (str.charAt(i+1) == ch)){
                    result = result.substring(0,result.length()-1);
                    i++;
                    onceMore = true;
                }
            }
            if(onceMore)str = result.concat("");
        }while (onceMore);

        System.out.println(str);
    }
}
