package programming.arrays;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicateNumber {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i< nums.length;i++){
            if(list.contains(nums[i])){
                System.out.println(nums[i]);
            }
            else{
                list.add(nums[i]);
            }
        }
        System.out.println(0);
    }
}
