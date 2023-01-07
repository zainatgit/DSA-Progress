package programming;

import java.util.*;
import java.util.stream.Collectors;

public class Playground2 {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] result ={-1,-1};
        result[0] = findLast(nums,target);
        result[1] = findFirst(nums,target);
        System.out.println(result[0]+" : "+result[1]);
    }

    private static int findLast(int[] nums, int target) {
        int end = nums.length-1;
        int start = 0;
        int mid = 0;
        int idx = -1;
        while(end>=start){
            mid = (start+end)/2;
            if(nums[mid]>=target){
                end = mid -1;
            }else{
                start = mid + 1;
            }
            if(nums[mid] == target) idx = mid;
        }
        return idx;
    }

    private static int findFirst(int[] nums, int target) {
        int end = nums.length-1;
        int start = 0;
        int mid = 0;
        int idx = -1;
        while(end>=start){
            mid = (start+end)/2;
            if(nums[mid]<=target){
                start = mid + 1;
            }else{
                end = mid -1;
            }
            if(nums[mid] == target) idx = mid;
        }
        return idx;
    }
}
