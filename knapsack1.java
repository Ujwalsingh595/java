package dp;

import java.util.Arrays;

public class knapsack1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int w=10,n=4;
		int wt[]= {1,3,4,6};
		int value[]= {20,30,10,50};
		System.out.println(knapsack3(wt,value,w,n));

	}
	//recursive
	public static int knapsack(int wt[],int value[],int w,int n) {
		if(n==0||w==0)
			return 0;
		if(wt[n-1]<=w) {
			return Math.max(value[n-1]+knapsack(wt,value,w-wt[n-1],n-1),knapsack(wt,value,w,n-1));
		}
		else {
			return knapsack(wt,value,w,n-1);
		}
	}
	//top_down
	public static int knapsack2(int wt[],int value[],int w,int n) {
		int dp[][]=new int[n+1][w+1];
		for(int[]  arr:dp) {
			Arrays.fill(arr,-1);
		}
		if(n==0||w==0)
			return 0;
		if(dp[n][w]!=-1) {
			return dp[n][w];
		}
		if(wt[n-1]<=w) {
			return dp[n][w]=Math.max(value[n-1]+knapsack2(wt,value,w-wt[n-1],n-1),knapsack2(wt,value,w,n-1));
		}
		else {
			return dp[n][w]=knapsack2(wt,value,w,n-1);
		}
	}
	//bottom_up
	public static int knapsack3(int wt[],int value[],int w,int n) {
		int dp[][]=new int[n+1][w+1];
		for(int i=0;i<n+1;i++) {
			for(int j=0;j<w+1;j++) {
				if(i==0||j==0) {
					 dp[i][j]=0;
				}
			}
		}
		for(int i=1;i<n+1;i++) {
			for(int j=1;j<w+1;j++) {
				if(wt[i-1]<=j) {
				 dp[i][j]=Math.max(value[i-1]+dp[i-1][j-wt[i-1]],dp[i-1][j]);
				}
				else {
					dp[i][j]=dp[i-1][j];
				}
			}
		}
		return dp[n][w];
	}
}
