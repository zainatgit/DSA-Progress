package programming.arrays;

public class TrappingRainwater {
    public static void main(String[] args) {
        int[] arr = {5,4,1,2};
        //System.out.println(naiveApproach(arr));
        System.out.println(FirstEffecientApproach(arr)); //Using auxillary array
        
    }

    private static int FirstEffecientApproach(int[] arr) {
        int w = 0;
        int left[] = new int[arr.length];
        int right[] = new int[arr.length];
        left[0] = arr[0];
        for(int i=1;i< arr.length;i++){
            left[i] = Math.max(left[i-1],arr[i]);
        }
        right[arr.length-1] = arr[arr.length-1];
        for(int i=arr.length-2; i>=0;i--){
            right[i] = Math.max(right[i+1],arr[i]);
        }

        for(int i=1;i<arr.length;i++){
            w+=Math.min(left[i],right[i]) - arr[i];
        }
        return w;
    }

    private static int naiveApproach(int[] arr) {
        int sum=0;
        int p=0;
        int k=0;
        int nextMin = Integer.MAX_VALUE;
        int nextMinIdx = 0;
        boolean last = false;
        int diff = 0;
        while(p< arr.length-1){
            if(arr[p]>0){
                k = p+1;
                for(int i=k;i< arr.length;i++){
                    if(arr[i] == arr[p]){
                        sum+=findWater(arr,p,i);
                        p=i;
                        last = false;
                        break;
                    }else if(arr[i] > arr[p]){
                        sum+=findWater(arr,p,i);
                        p=i;
                        last = false;
                        break;
                    }else{
                        diff = arr[p] - arr[i];
                        if(diff <= nextMin){
                            nextMin = diff;
                            nextMinIdx = i;
                            last = true;
                        }

                    }

                }
                if(last){
                    sum+=findWater(arr,p,nextMinIdx);
                    p=arr.length;
                }
            }else{
                p++;
            }
        }
        return sum;
    }

    private static int findWater(int[] arr, int p, int i) {
        int max =0;
        int min = 0;
        int startIdx = 0;
        int endIdx = 0;
        int w = 0;
        if(arr[p] >= arr[i]){
            max = arr[p];
            min = arr[i];
            startIdx = p;
            endIdx = i;
        }else{
            max = arr[i];
            min = arr[p];
            startIdx = i;
            endIdx = p;
        }
        if(startIdx > endIdx){
            for(int j=startIdx-1;j>endIdx;j--){
                w+=min-arr[j];
            }
        }else{
            for(int j=startIdx+1;j<endIdx;j++){
                w+=min-arr[j];
            }
        }
        return w;
    }

}
