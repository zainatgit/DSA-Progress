package programming.strings;

import java.util.LinkedList;
import java.util.Queue;

public class IsStringRotationOfAnother {
    public static void main(String[] args) {
        String str1 = "AACD";
        String str2 = "ACDA";
        String str3 = "AACD";


        Queue<Character> q1 = new LinkedList<>();
        Queue<Character> q2 = new LinkedList<>();
        populateQueue(q1,str1);
        populateQueue(q2,str2);
        System.out.println(checkIfRotation(q1,q2));
    }

    private static boolean checkIfRotation(Queue<Character> q1, Queue<Character> q2) {
        if(q1.size() == q2.size()){
            int k = q2.size();
            while (k>0){
                k--;
                if(q1.equals(q2)){
                    return true;
                }
                q2.add(q2.poll());
            }
            return false;
        }else{
            return false;
        }
    }

    private static void populateQueue(Queue<Character> q, String str) {
        for(int i=0; i<str.length(); i++){
            q.add(str.charAt(i));
        }
    }
}
