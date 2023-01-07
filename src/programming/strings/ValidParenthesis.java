package programming.strings;

import java.util.Arrays;
import java.util.Stack;

/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.

 */
public class ValidParenthesis {
    public static void main(String[] args) {
        String s = "()[]{{}";
        System.out.println(checkValidBrackets(s));

    }

    private static boolean checkValidBrackets(String s) {
        Stack<Character> stc = new Stack<>();
        for (Character ch : s.toCharArray()){
            switch (ch) {
                case '(' :
                case '[' :
                case '{' :
                    stc.push(ch);
                    break;
                case ')'  :
                    if(stc.isEmpty() || !stc.pop().equals('(')){
                        return false;
                    }
                    break;
                case '}'  :
                    if(stc.isEmpty() || !stc.pop().equals('{')){
                        return false;
                    }
                    break;
                case ']'  :
                    if(stc.isEmpty() || !stc.pop().equals('[')){
                        return false;
                    }

            }
        }
        if(stc.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

}
