package logical;
import java.util.*;
public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int  r,sum=0,temp;
		temp=n;
		while(n>0)
		{
			r=n%10;
			sum=sum*10+r;
			n=n/10;
		}
		if(temp==sum)
			System.out.println("palindrome  number");
		else
		System.out.println("Not palindrome");	
	}

}
