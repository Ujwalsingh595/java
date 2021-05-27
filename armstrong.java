package logical;
import java.util.*;
public class armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int r,sum=0;
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int temp=n;
		while(n>=1)
		{
			r=n%10;
			sum=sum+r*r*r;
			n=n/10;
		}
		if(temp==sum)
			System.out.println("Armstrong  number");
		else
			System.out.println("Not armstrong");
	}

}
