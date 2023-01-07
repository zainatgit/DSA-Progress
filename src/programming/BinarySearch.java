package programming;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {5,7,8,9,10,11,13,16,19,22,27,29};
        int target = 5;
        int end = nums.length-1;
        int start = 0;
        int mid = 0;
        while(end >= start){
            mid = (end+start)/2;
            if(target > nums[mid]){
                start = mid+1;
            }else if (target<nums[mid]){
                end = mid-1;
            }else{
                System.out.println(mid);
                break;
            }

        }
        System.out.println("Not found");
    }
}
