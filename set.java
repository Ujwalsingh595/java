package collection;

import java.util.*;

public class set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,4,-1,4,3,-6,-7,2};
		boolean found=false;
		Set<Integer> set=new HashSet<>();
		int sum=0;
		for(int element:a) {
			set.add(sum);
			sum=sum+element;
			if(set.contains(sum)) {
				found=true;
				break;
			}
		}
		if(found)
			System.out.println("found "+ found);
		
	}

}
