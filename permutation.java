package recursion;
import java.util.*;
public class permutation {
	static Set<String> set=new HashSet<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		permut("abc",0,2);

	}
	static void permut(String s,int l,int r)
	{
		if(l==r) {
			if(set.contains(s)) return;
			set.add(s);
			System.out.println(s);
			return;
		}
			for(int i=0;i<s.length();i++) {
				s=interchange(s,l,i);
				permut(s,l+1,r);
				s=interchange(s,l,i);
			}
	}
	static String interchange(String s,int a,int  b)
	{
		char array[]=s.toCharArray();
		char temp=array[a];
		array[a]=array[b];
		array[b]=temp;
		return String.valueOf(array);
	}

}
