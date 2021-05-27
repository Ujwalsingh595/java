package dp;

import java.util.*;

public class fib {
	//using recursion
	public static int fib(int n) {
		if(n==0||n==1) {
			return n;
		}
		return fib(n-1)+fib(n-2);
	}
	//using topdown dp
	public static int tdfib(int n,int  dp[]) {
		if(n==1||n==0) {
			dp[n]=n;
			return n;
		}
		if(dp[n]!=-1) {
			return dp[n];
		}else
			return dp[n]=tdfib(n-1,dp)+tdfib(n-2,dp);
	}
	//using bottom up dp
	public static int bufib(int n,int dp[]) {
		dp[0]=0;
		dp[1]=1;
		for(int i=2;i<=n;i++) {
			dp[i]=dp[i-1]+dp[i-2];
		}
		return dp[n];
	}
	public static  void main(String args[]) {
		int dp[]=new int[100];
		
		Arrays.fill(dp,-1);
		System.out.println(bufib(8,dp));
	}
}
