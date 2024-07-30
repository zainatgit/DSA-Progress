package programming.arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayCombinations {

    public static List<List<Integer>> findCombinations(int[] arr, int n) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> combination = new ArrayList<>();
        findCombinationsUtil(arr, n, 0, combination, result);
        return result;
    }

    private static void findCombinationsUtil(int[] arr, int n, int start, List<Integer> combination, List<List<Integer>> result) {
        if (n == 0) {
            result.add(new ArrayList<>(combination));
            return;
        }

        for (int i = start; i <= arr.length - n; i++) {
            combination.add(arr[i]);
            findCombinationsUtil(arr, n - 1, i + 1, combination, result);
            combination.remove(combination.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = 3; // The value of n, i.e., the number of elements in each combination

        List<List<Integer>> combinations = findCombinations(arr, n);

        // Print all combinations
        for (List<Integer> combination : combinations) {
            System.out.println(combination);
        }
    }
}
