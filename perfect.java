package logical;
import java.util.*;
public class perfect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int temp=n;
		int  i=1,sum=0;
		while(i<n)
		{
			if(n%i==0)
				sum=sum+i;
			i++;
		}
		if(temp==sum)
			System.out.println("Perfect number");
		else
			System.out.println("Not perfect");
	}

}
