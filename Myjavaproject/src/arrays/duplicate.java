package arrays;

import java.util.Scanner;

class duplicate{
    public static int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        // First phase: Detect intersection point in the cycle
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        // Second phase: Find the entrance to the cycle (duplicate number)
        fast = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
        public static void main(String[] args) {
            // Example
            int[] arr = {1, 2, 3, 4, 5,2};
             int result= findDuplicate(arr);
System.out.println(result);        }
}