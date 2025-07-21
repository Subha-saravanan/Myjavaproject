package linkedlist.checking;
import java.util.*;

public class Nterm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t;

        if (n % 2 == 1) {
            // For odd positions, use power of 2
            t = (int) Math.pow(2, (n - 1) / 2);
        } else {
            // For even positions, use power of 3
            t = (int) Math.pow(3, (n / 2) - 1);
        }

        System.out.println(t);
    }
}
