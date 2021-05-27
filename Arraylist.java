package collection;
import  java.util.*;
public class Arraylist {

	public static void main(String[] args) {
		List<String> fruits=new ArrayList();
		
		fruits.add("Apple");
		fruits.set(0,"Bannana");
		fruits.add("hi");
		fruits.remove(1);
		System.out.println(fruits);
		
	}

}
