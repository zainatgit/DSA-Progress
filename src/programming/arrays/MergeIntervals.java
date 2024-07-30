package programming.arrays;

import java.util.ArrayList;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        optimalApproach(intervals);
    }

    private static void optimalApproach(int[][] intervals) {
        int r = intervals.length;
        List<List<Integer>> outputList = new ArrayList<>();
        int curr = 0;
        for(int i=0; i<r; i++){
            if(outputList.isEmpty()){
                List<Integer> eachArr = new ArrayList<>();
                eachArr.add(intervals[i][0]);
                eachArr.add(intervals[i][1]);
                outputList.add(eachArr);
            }else{
                if(intervals[i][0] <= outputList.get(curr).get(1)){
                    outputList.get(curr).remove(1);
                    outputList.get(curr).add(intervals[i][1]);
                }else{
                    List<Integer> eachArr = new ArrayList<>();
                    eachArr.add(intervals[i][0]);
                    eachArr.add(intervals[i][1]);
                    outputList.add(eachArr);
                    curr++;
                }
            }
        }
        outputList.stream().forEach(e-> System.out.println(e.toString()));
    }
}
