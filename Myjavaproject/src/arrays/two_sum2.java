
package arrays;
import java.util.Arrays;
public class two_sum2{
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        // Step 1: Store value and original index in a 2D array
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = nums[i]; // value
            arr[i][1] = i;       // original index
        }

        // Step 2: Sort array by value (ascending)
        Arrays.sort(arr, (a, b)-> Integer.compare(a[0], b[0]));

        // Step 3: Use two pointers to find the target sum
        int left = 0, right = n - 1;
        while (left < right) {
            int sum = arr[left][0] + arr[right][0];
            if (sum == target) {
                // Return original indices
                return new int[] {arr[left][1], arr[right][1]};
            } else if (sum < target) {
                left++;  // increase sum
            } else {
                right--; // decrease sum
            }
        }

        return new int[] {-1, -1}; // Not found
    }

    public static void main(String[] args) {
        int[] nums = {15,2, 7, 11};
        int target = 9;

        int[] result = twoSum(nums, target);
        System.out.println("Indices: " + Arrays.toString(result));
    }
}