package arrays;
import java.util.Arrays;
public class permutation {
	public void nextPermutation(int[] nums) {
		if (nums == null || nums.length <= 1)
			return;
		int i = nums.length - 2;
		// Step 1: Find the first decreasing number from the end
		while (i >= 0 && nums[i] >= nums[i + 1])
			i--;
		if (i >= 0) {
			// Step 2: Find the next bigger element after i
			int j = nums.length - 1;
			while (nums[j] <= nums[i])
				j--;
			swap(nums, i, j); // Step 3: Swap
		}
		reverse(nums, i + 1, nums.length - 1);
	}
	public void swap(int[] A, int i, int j) {
		int tmp = A[i];
		A[i] = A[j];
		A[j] = tmp;
	}
	public void reverse(int[] A, int i, int j) {
		while (i < j)
			swap(A, i++, j--);
	}
	public static void main(String[] args) {
		permutation solver = new permutation();

		int[] nums = { 1, 2, 3 }; // Example input
		System.out.println("Original:  " + Arrays.toString(nums));

		solver.nextPermutation(nums);
		System.out.println("Next Perm: " + Arrays.toString(nums));
	}
}