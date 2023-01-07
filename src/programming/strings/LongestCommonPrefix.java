package programming.strings;
/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters.
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String arr[] = {"ab", "a"};
        int len = arr.length;
        String result = "";
        int k=0;
        boolean continueLoop = true;
        while(true){
            boolean same = false;
            for(int i=0; i<len; i++){
                if(arr[i].length() > k){
                    char ch = arr[0].charAt(k);
                    if(arr[i].charAt(k) == ch){
                        same = true;
                    }else{
                        same = false;
                        break;
                    }
                }else{
                    same=false;
                    break;
                }
            }
            if(same){
                k++;
            }else {
               break;
            }
        }
        if(k>0){
            result = arr[0].substring(0,k);
        }
        System.out.println(result);
    }
}
