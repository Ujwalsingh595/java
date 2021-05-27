package logical;

import java.util.Scanner;

public class primeusingwhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  a  number");
		int n=sc.nextInt();
		boolean isprime=true;
		int i=2;
		while(i<n/2) {
			if(n%i==0)
				isprime=false;
			i++;
		}
		if(isprime)
			System.out.println("Prime");
		else
			System.out.println("Not prime");
	}

}
