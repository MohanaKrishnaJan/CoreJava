package June20;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] findTwoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (numMap.containsKey(complement)) {
                int complementIndex = numMap.get(complement);
                return new int[]{complementIndex, i};
            }

            numMap.put(nums[i], i);
        }

        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50, 60};
        int target = 100;

        int[] result = findTwoSum(nums, target);

        if (result.length == 2) {
            System.out.println("[" + result[0] + "," + result[1] + "]");
        } else {
            System.out.println("No two numbers found that add up to the target sum.");
        }
    }
}
