package string;
import  java.util.*;
public class anagram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  the string");
		String a=sc.next();
		String b=sc.next();
		boolean isanagram=false;
		boolean visited[]=new boolean[b.length()];
		for(int i=0;i<a.length();i++) {
			char c=a.charAt(i);
			for(int j=0;j<b.length();j++) {
				if(b.charAt(j)==c && !visited[j]) {
					isanagram=true;
					visited[j]=true;
					break;
				}
					
			}
			if(!isanagram)
				break;
			
		}
		if(isanagram)
			System.out.println("anagram");
		else
			System.out.println("not anagram");

	}

}
