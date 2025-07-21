package linkedlist.checking;
import java.util.List;
import java.util.Collections;
//import com.sun.tools.javac.util.List;
import java.util.Comparator;
//import com.sun.tools.javac.util.Li
// jdk.internal.org.jline.terminal.TerminalBuilder.SystemOutput;

import java.util.ArrayList;
public class listaddandcheck{
	public static void main(String [] args) {
    Comparator<Integer>com= new Comparator<Integer>()
    {
	   public int compare(Integer i,Integer j) 
	   {
		   
			   if(i%10>j%10) return 1;
			   else return -1;
	   }
	   };
    
	List <Integer>l= new ArrayList<>();
	l.add(23);
	l.add(41);
	l.add(82);
	l.add(92);
	l.add(200);
	/*
	 * 
	 * for(int n:l) { System.out.println(n,com); }
	 }
	 */
	
	Collections.sort(l,com);
	System.out.println(l);
}
}
