package logical;
import java.util.*;
public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  a  numebr");
		int n=sc.nextInt();
		boolean isprime=true;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				isprime=false;
				break;
			}
		}
		if(isprime)
			System.out.println("Prime number");
		else
			System.out.println("Not prime");
		
	}

}
