package programming;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Playground {

    public static void main(String[] args) {
        System.out.println("Hello World");
        String str = "hannah";

        //System.out.println(isPalindrome(str));
        int num = 1000000000;
        System.out.println(num*-10);
        System.out.println(Integer.MAX_VALUE);
    }

    public static boolean isPalindrome(String str){
        if(str.length() <= 1){
            return true;
        }
        if(str.charAt(0) == str.charAt(str.length()-1)){
            str = str.substring(1,str.length()-1);
            isPalindrome(str);
        }
        return false;
    }
}

// foreach -> one by one
// map -> alters each element and forwards further
// filter -> filters out based on condition, use this as first step
// reduce -> produce single result from stream, starting_value, (subtotal, element) -> subtotal+element
// distinct -> filters for distinct values
// sorted -> sorts the stream. Parameters in sorted -> Comparator.naturalOrder() , Comparator.reverseOrder(), Custom comparator Comparator.comparing(x -> x.length())
// collect -> collects the stream and returns in form of Collection. collect(Collectors.asList())