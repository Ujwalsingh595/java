package logical;

import java.util.Arrays;

public class sieveoferathosenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isprime[]=prime(12);
		for(int i=0;i<=12;i++) {
			System.out.println(i +" "+ isprime[i]);
		}
	}static boolean[] prime(int n) {
		boolean isprime[]=new boolean[n+1];
		Arrays.fill(isprime, true);
		isprime[0]=false;
		isprime[1]=false;
		for(int i=2;i*i<=n;i++)
		{
			for(int j=2*i;j<=n;j+=i) {
				isprime[j]=false;
			}
		}
		return isprime;
	}
}
