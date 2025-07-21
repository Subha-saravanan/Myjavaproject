//Best sign order arrangenent without equal signs: ( remaining as it is areanged) 
package arrays;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class signoptimal{
	    public static int[] rearrangeArray(int[] nums) {
	        List<Integer> pos = new ArrayList<>();
	        List<Integer> neg = new ArrayList<>();

	        for (int num : nums) {
	            if (num >= 0) pos.add(num);
	            else neg.add(num);
	        }

	        List<Integer> res = new ArrayList<>();
	        int i = 0, j = 0;

	        while (i < pos.size() && j < neg.size()) {
	            res.add(pos.get(i++));
	            res.add(neg.get(j++));
	        }

	        while (i < pos.size()) res.add(pos.get(i++));
	        while (j < neg.size()) res.add(neg.get(j++));

	        return res.stream().mapToInt(n -> n).toArray();
	    }

	    public static void main(String[] args) {
	        int[] input = {1, 2, -1, -2, -3, 3,8,4,-3,100};
	        int[] output = rearrangeArray(input);
	        System.out.println("Rearranged: " + Arrays.toString(output));
	    }
	}
	    

	