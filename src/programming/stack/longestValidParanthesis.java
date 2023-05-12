package programming.stack;
/*
Example 1:

Input: s = "(()"
Output: 2
Explanation: The longest valid parentheses substring is "()".
Example 2:

Input: s = ")()())"
Output: 4
Explanation: The longest valid parentheses substring is "()()".
Example 3:

Input: s = ""
Output: 0
 */
public class longestValidParanthesis {
    public static void main(String[] args) {
        java.util.Stack<Character> stack = new java.util.Stack<>();

        String s = "()(()";
        int currCount = 0;
        int maxCount = 0;
        boolean flag = true;
        boolean extra = true;
        for(int i=0; i<s.length(); i++){
            Character ch = s.charAt(i);
            if(ch == '('){
                stack.push(ch);
            }else{
                if(stack.isEmpty()){
                    flag = false;
                }
                if(!stack.isEmpty()){
                    Character topChar = stack.pop();
                    if(topChar == '('){
                        if(flag && extra == true){
                            currCount = currCount + 2;
                        }else{
                            currCount = 0;
                        }
                        if(currCount > maxCount){
                            maxCount = currCount;
                        }
                    }
                }
                if(stack.isEmpty()){
                    flag = true;
                }
            }
        }
        System.out.println(maxCount);


    }
}
