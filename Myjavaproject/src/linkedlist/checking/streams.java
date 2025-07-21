package linkedlist.checking;
import java.util.stream.*;

//import com.sun.tools.javac.code.Attribute.Array;

import java.util.List;
import java.util.Optional;
//import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;


class streams{
	public static  void main(String[] args) {
List<Integer>l=Arrays.asList(2,3,45,6,7,8);
int result=l.stream()
 .filter(n->n%2==0)
 .map(n->n*n)
 .reduce(0,(c,e)->c-e);

System.out.println(result);
}
	}

