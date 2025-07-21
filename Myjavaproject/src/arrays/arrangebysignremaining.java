package arrays;
import java.util.*;

public class arrangebysignremaining{
    public static int[] rearrangeBySign(int[] nums) {
        List<Integer> positives = new ArrayList<>();
        List<Integer> negatives = new ArrayList<>();

        // Separate positive and negative numbers
        for (int num : nums) {
            if (num >= 0) positives.add(num);
            else negatives.add(num);
        }

        List<Integer> result = new ArrayList<>();
        int i = 0;

        // Alternate between positive and negative
        while (i < positives.size() && i < negatives.size()) {
            result.add(positives.get(i));
            result.add(negatives.get(i));
            i++;
        }

        // Add remaining elements (if any)
        while (i < positives.size()) result.add(positives.get(i++));
        while (i < negatives.size()) result.add(negatives.get(i++));

        // Convert to array
        return result.stream().mapToInt(n -> n).toArray();
    }

    public static void main(String[] args) {
        int[] input = {1, 2,-3, -1, -2, 3,4,8,-1};
        int[] output = rearrangeBySign(input);
        System.out.println("Rearranged: " + Arrays.toString(output));
    }
}