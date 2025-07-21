package linkedlist.checking;
import java.util.stream.*;

//import com.sun.tools.javac.code.Attribute.Array;

import java.util.List;
import java.util.Optional;
//import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;


class streamstring{
	public static  void main(String[] args) {
List<String>l=Arrays.asList("subha","harish");
l.stream()
.filter(n->n.startsWith("s"))
.forEach(System.out::println);}}