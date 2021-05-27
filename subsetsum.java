package dp;

import java.util.Arrays;

public class subsetsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,5,11,52};
		int n=arr.length;
		System.out.println(equalSumpartition(arr,n));
	}
	public static boolean subset(int arr[],int n,int sum) {
		boolean dp[][]=new boolean[n+1][sum+1];
		for(int i=0;i<n+1;i++) {
			for(int j=0;j<sum+1;j++) {
				if(i==0)
					dp[i][j]=false;
			else if(j==0)
				dp[i][j]=true;
		}
	}
		for(int i=1;i<n+1;i++) {
			for(int j=1;j<sum+1;j++) {
				if(arr[i-1]<=j) {
					dp[i][j]=(dp[i-1][j-arr[i-1]]||dp[i-1][j]);
				}else
					dp[i][j]=dp[i-1][j];
			}
		}
		return dp[n][sum];
}
	public static boolean equalSumpartition(int arr[],int n) {
		int s=0;
		for(int i=0;i<arr.length;i++) {
			s=s+arr[i];
		}
		if(s%2!=0) {
			return false;
		}else
			return subset(arr,n,s/2);
	}
}