package programming.arrays;

public class MaxSubarrayProduct {
    public static void main(String[] args) {
        int nums[] = new int[]{0,10,10,10,10,10,10,10,10,10,-10,10,10,10,10,10,10,10,10,10,0};
        int max = Integer.MIN_VALUE;
        int n = nums.length;
        int base = 1;
        for(int i=0; i<n; i++){
            base = nums[i];
            if(base > max) max = base;
            if(nums[i] !=0){
                for(int j=i+1;j<n;j++){
                    base*=nums[j];
                    if(base > max) max = base;
                }
            }
        }
        System.out.println(max);
    }
}
