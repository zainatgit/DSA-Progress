package programming.recurssion;

import java.util.*;

public class CombinationSum2 {
    public static void main(String[] args) {
        int nums[] = {10,1,2,7,6,1,5};
        int target = 8;
        Set<List<Integer>> finalSet = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        combinationSum2(nums,target,finalSet,list,0);
        finalSet.stream().forEach(System.out::println);
    }

    private static void combinationSum2(int[] nums, int target, Set<List<Integer>> finalSet, List<Integer> list, int i) {

        if(i==nums.length || target == 0){
            if(target == 0){
                finalSet.add(new ArrayList<>(list));
            }
            return;
        }
        if(nums[i] <= target){
            list.add(nums[i]);
            Collections.sort(list);
            combinationSum2(nums,target-nums[i],finalSet,list,i+1);
            list.remove(list.size()-1);
        }
        combinationSum2(nums,target,finalSet,list,i+1);

    }
}
