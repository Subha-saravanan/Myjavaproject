
package arrays;
import java.util.Scanner;

public class rotate{
    // Function to reverse part of array from index 'start' to 'end'
    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
    }

    // Function to left rotate array by d positions
    static void leftRotate(int[] arr, int d) {
        int n = arr.length;
        d = d % n;  // for lest
        d = n - d; ///only for right rotate

        reverse(arr, 0, d - 1);      // Step 1: Reverse first part
        reverse(arr, d, n - 1);      // Step 2: Reverse second part
        reverse(arr, 0, n - 1);      // Step 3: Reverse entire array
    }

    public static void main(String[] args) {
        // Example
        int[] arr = {1, 2, 3, 4, 5};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter positions to shift left: ");
        int d = sc.nextInt();

        leftRotate(arr, d);

        System.out.print("Shifted Array: ");
        for (int num : arr)
            System.out.print(num + " ");
    }
}



