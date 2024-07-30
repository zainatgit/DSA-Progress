package programming.arrays.matrix;

public class RotateImage {
    public static void main(String[] args) {
        int[][] matrix = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        for (int i = 0; i< matrix.length; i++){
            for (int j = 0; j< matrix.length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("-------------------");
        transpose(matrix);
        for (int i = 0; i< matrix.length; i++){
            for (int j = 0; j< matrix.length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("-------------------");
        reverseEachRow(matrix);
        for (int i = 0; i< matrix.length; i++){
            for (int j = 0; j< matrix.length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static void reverseEachRow(int[][] matrix) {
        int r = matrix.length;
        for(int i=0;i<r;i++){
            int[] arr = matrix[i];
            int start = 0;
            int end = r-1;
            while(start<end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
    }



    private static void transpose(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                swap(matrix,i,j);
            }
        }
    }

    private static void swap(int[][] matrix, int i, int j) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }
}
