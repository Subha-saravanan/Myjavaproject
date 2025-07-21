package arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class two_sum{
public static int[] twoSum(int[] nums, int target) {
    Map <Integer, Integer> res = new HashMap<>();
    int[] ans = new int[2];

    for (int i = 0; i < nums.length; i++) {
        if (res.containsKey(target - nums[i])) {
            ans[0] = i;
            ans[1] = res.get(target - nums[i]);
        } else {
            res.put(nums[i], i);
        }
    }
    return ans;
}
    public static void main(String[] args) {
        int[] nums = {1,2,4,8};
        int target=9;
        int [] result = twoSum(nums,target);
        System.out.println(Arrays.toString(result));
}
}