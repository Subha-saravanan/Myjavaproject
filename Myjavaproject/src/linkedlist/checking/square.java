package linkedlist.checking;

import java.util.Scanner;

//import jdk.internal.org.jline.terminal.TerminalBuilder.SystemOutput;

public class square {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt(); // Number of test cases
		int[] n = new int[t];
		for (int i = 0; i < t; i++) {
			n[i] = sc.nextInt();
		}
		for (int i = 0; i < t; i++) {


			if (call(n[i])) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
//sc.close();
	}
		public static boolean call( int n) {
		int square = n * n;

		// Convert both to string to check if square ends with the number
		String numStr = String.valueOf(n);
		String squareStr = String.valueOf(square);
		return squareStr.endsWith(numStr);}
	//System.out.println();
}
