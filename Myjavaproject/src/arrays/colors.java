package arrays;
import java.util.Arrays;
class Solution {
	public static int[] sortColors(int[] nums) {
		int zeroPointer = 0;
		int twoPointer = nums.length - 1;
		int i = 0;
		while (i <= twoPointer) {
			if (nums[i] == 0) {
				swap(nums, i, zeroPointer);
				i++;
				zeroPointer++;

			}
			else if (nums[i] == 2) {
				swap(nums, i, twoPointer);
				twoPointer--;
			}
			else {
				i++;
			}
		}
		return nums;
	}
	private static void swap(int nums[], int num1, int num2) {
		int temp = nums[num1];
		nums[num1] = nums[num2];
		nums[num2] = temp;
	}
public static void main(String[] args) {
		int[] nums= new int[]{ 1, 2, 2, 0, 1, 2, 0, 2};
		int[] result = sortColors(nums);
		System.out.println(Arrays.toString(result));
	}
}