package arrays;

public class numbersingle {
	public static int singleNumber(int[] nums) { 
    int ans=0; //since XOR with 0 returns same number 
   for(int i=0; i<nums.length; i++){ 
       ans ^= nums[i];  // ans = (ans) XOR (array element at i) 
   } 
   return ans; 
}

	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		int result = singleNumber(nums);
        System.out.println("Maximum consecutive 1s: " + result);
        //TODO Auto-generated method stub

	}

}
