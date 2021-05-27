package string;
import java.util.Scanner;

public class anagramtwo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  the string");
		String a=sc.next();
		String b=sc.next();
		int al[]=new int[256];
		int bl[]=new int[256];
		boolean  isanagram=true;
		for(char c:a.toCharArray()) {
			int index=(int)c;
			al[index]++;
		}
		for(char c:b.toCharArray()) {
			int index=(int)c;
			bl[index]++;
		}
		for(int i=0;i<256;i++) {
			
			if(al[i]!=bl[i])
				isanagram=false;
			break;
		}
		if(isanagram)
			System.out.println("anagram");
		else
			System.out.println("not anagram");
	}
}
