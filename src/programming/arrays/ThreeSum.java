package programming.arrays;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> masterList = new ArrayList<>();
        for(int i=0; i<nums.length-1;i++){
            HashSet<Integer> hs = new HashSet<>();
            for(int j=i+1;j<nums.length;j++){
                if(hs.contains(-(nums[i]+nums[j]))){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(-(nums[i]+nums[j]));
                    Collections.sort(list);
                    if(!masterList.contains(list)){
                        masterList.add(list);
                    }
                }else{
                    hs.add(nums[j]);
                }
            }
        }
        System.out.println(masterList);
        //return masterList;
    }
}
