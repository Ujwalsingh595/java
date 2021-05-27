package logical;
import java.util.*;
public class strong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int temp=n;
		int r,sum=0;
		while(n!=0)
		{
			r=n%10;
			sum=sum+fact(r);
			n=n/10;
		}
		if(temp==sum)
			System.out.println("Strong number");
		else
			System.out.println("Not strong");
		
	}
	static int fact(int n)
	{
		if(n==1)
			return 1;
		return fact(n-1)*n;
	}
	

}
