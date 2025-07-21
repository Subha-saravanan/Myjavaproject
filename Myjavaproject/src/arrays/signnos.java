//No of signs equal arrangement :( pos= neg no ) 
package arrays;
import java.util.Arrays;

public class signnos {
    public static int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int pos = 0, neg = 1;

        for (int num : nums) {
            if (num >= 0) {
                res[pos] = num;
                pos += 2;
            } else {
                res[neg] = num;
                neg += 2;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] input = {3, 1,-2,-5,2,-4};
        int[] output = rearrangeArray(input);
        System.out.println("Rearranged: " + Arrays.toString(output));
    }
}
