package programming.arrays.matrix;

public class ZigZagDiagonalTraversal {
    public static void main(String[] args) {
        int arr[][] = {
                {1,2,3},
                {4,5,6},
                {6,7,8}
        };


        int max_row = arr.length;
        int max_col = arr[0].length;
        if(max_row > max_col){

        }
        //Print till diagonal line
        int k=0;
        for(int i=0;i<max_row;i++){
            k = i;
            for(int j=0;j<=i;j++){
                System.out.print(arr[k--][j]);
            }
            System.out.println();
        }

        if(max_row == max_col){ //Case of square matrix

            for(int i=max_row; i>=1;i++){
                
            }
        }



    }
}
