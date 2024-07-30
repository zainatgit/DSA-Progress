package programming.arrays.matrix;

/*
Given matrix has the following properties:

Integers in each row are sorted from left to right.
The first integer of each row is greater than the last integer of the previous row
 */
public class SearchIn2DMatrix {
    public static void main(String[] args) {
        int[][] arr ={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 34;
        int c = arr[0].length;
        int row_num = 0;
        for(int i=0;i<c;i++){
            if(target<=arr[i][c-1]){
                row_num = i;
                break;
            }
        }
        //Now do binary seach in this row
        int[] target_row = arr[row_num];
        int l = 0;
        int r = target_row.length-1;
        int mid =l + (r-l)/2;
        while(l<=r){
            if(target_row[mid] == target){
                System.out.println(row_num+"  "+mid+" "+true);
                break;
            }else if(target<target_row[mid]){
                r = mid-1;
            }else{
                l=mid+1;
            }
            mid = l + (r-l)/2;
        }
    }
}
