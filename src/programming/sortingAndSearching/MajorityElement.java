package programming.sortingAndSearching;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int arr[] = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        System.out.println(naiveApproach(arr));
    }

    private static int naiveApproach(int[] arr) {
        int len = arr.length;
        Map<Integer,Integer> hm = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            if(hm.containsKey(arr[i])){
                int count = hm.get(arr[i]);
                count++;
                if(count > len/2){
                    return arr[i];
                }else{
                    hm.replace(arr[i],count);
                }
            }else{
                hm.put(arr[i],1);
            }
        }
        return arr[0];
    }
}
