package programming.recurssion;

import java.util.ArrayList;
import java.util.List;

public class SubsequenceSum {
    public static void main(String[] args) {
        int nums[] = {2, 3, 3, 4, 6, 7};
        int target = 12;
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        subseq(result, output, nums, 0, target);
        int c = 0;
        for (List<Integer> eachList : result) {
            if(!eachList.isEmpty()){
                int min = eachList.stream().mapToInt(Integer::intValue).min().getAsInt();
                int max = eachList.stream().mapToInt(Integer::intValue).max().getAsInt();
                if (min+max <= target) {
                    c++;
                }
            }

        }
        System.out.println(c);
    }

    private static void subseq(List<List<Integer>> result, List<Integer> output, int[] nums, int start, int target) {
        if(start >= nums.length){
            result.add(new ArrayList<>(output));
            return;
        }
        output.add(nums[start]);
        subseq(result,output,nums,start+1,target);
        output.remove(output.size()-1);
        subseq(result,output,nums,start+1,target);
    }
}
