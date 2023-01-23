package programming.sortingAndSearching;

public class NextElementDiffersByAtMaxK {
    public static void main(String[] args) {
        int arr[] = {20, 40, 50, 70, 70, 60};
        int k = 20;
        int x = 60;
        int i = Math.max(1, Math.abs(arr[0]
                - x) / k);
        while(i< arr.length){
            if(arr[i] == x){
                System.out.println(i);
                break;
            }else{
                i = i + Math.max(1, Math.abs(arr[i]
                        - x) / k);
            }
        }
        System.out.println("Not found !!");
    }
}
