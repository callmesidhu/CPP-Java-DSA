package Array;

import java.util.HashMap;
import java.util.Map;


public class TwoSum {

    public static int[] twoSum1(int[] nums, int target) {
        // O(n^2)T, O(1)S
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j}; 
                }
            }
        }
        return new int[0]; 
    }
    public static int[] twoSum2(int[] nums, int target) {
        // O(n)T, O(n)S
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int match = target - nums[i];
            if (map.containsKey(match)) {
                return new int[] {map.get(match), i}; 
            } else {
                map.put(nums[i], i); 
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = {2, 11, 7, 15};
        int target = 9;
        int[] result = twoSum2(nums, target);

        if (result.length == 2) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No solution found.");
        }
    }
}
