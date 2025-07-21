package linkedlist.checking;
import java.util.*;

public class absoluteofoddandeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int odd=0;
        int even=0;
  for(int i=0;i<n.length();i++) {
	  int digit=n.charAt(i)-'0';
	  if((i+1)%2==0) {
		  odd+=digit;
	  }
	  else {
		  even+=digit;
	  }
	  }
  System.out.println(Math.abs(odd-even));
    }
}
