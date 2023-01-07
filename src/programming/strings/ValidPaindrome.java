package programming.strings;

import java.util.Locale;

/*
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
 */
public class ValidPaindrome {
    public static void main(String[] args) {

        String input = "race a car";
        int len = input.length();
        input = input.toLowerCase(Locale.ROOT);
        String newStr = "";
        for (int i = 0; i<len; i++){
            char ch = input.charAt(i);
            if((ch >=65 && ch<=90) || (ch >=97 && ch<=122) || (ch >=48 && ch<=57)){
                newStr+=ch;
            }
        }
        System.out.println("After cleanup : " + newStr);
        System.out.println(checkValidPalindrome(newStr));

    }



    private static boolean checkValidPalindrome(String newStr) {
        int len = newStr.length();
        for (int i = 0; i<len; i++){
            char first = newStr.charAt(i);
            char last = newStr.charAt(len-i-1);
            if(first != last){
                return false;
            }
        }
        return true;
    }

}
