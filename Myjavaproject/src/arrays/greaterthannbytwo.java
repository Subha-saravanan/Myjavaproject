
package arrays;
public class greaterthannbytwo {

    public static int majorityElement(int[] nums) {
        int res = 0, count = 1;

        // Step 1: First pass - Find a candidate
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[res]) {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                res = i;
                count = 1;
            }
        }

        // Step 2: Verify the candidate
        count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums[res]) {
                count++;
            }
        }

        if (count <= nums.length / 2) {
            res = -1;
        }

        return res == -1 ? -1 : nums[res];
    }

    public static void main(String[] args) {
        int[] nums = {3, 3, 4, 2, 3, 3, 3};
        int result = majorityElement(nums);

        if (result != -1) {
            System.out.println("Majority Element: " + result);
        } else {
            System.out.println("No majority element found.");
        }
    }
}