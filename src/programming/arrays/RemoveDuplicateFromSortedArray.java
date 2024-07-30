package programming.arrays;

import java.util.Arrays;

public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int newArr[] = new int[nums.length];
        int temp = nums[0];
        int k = 0;
        newArr[k++] = nums[0];
        for(int i=1; i<nums.length;i++){
            if(nums[i] == nums[i-1]){

            }else{
                newArr[k++] = nums[i];
            }
        }
        nums = newArr;
        Arrays.stream(newArr).forEach(System.out::println);
        System.out.println(k);
    }
}
