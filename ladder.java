package dp;
import java.util.*;
public class ladder {
	//recursive approach
	public static int ways(int n) {
		if(n==0) {
			return 1;
		}
		if(n<0)
			return 0;
		return ways(n-1)+ways(n-2);
	}
	public static int ways2(int n,int k) {
		if(n==0) {
			return 1;
		}
		if(n<0)
			return 0;
		int ans=0;
		for(int i=1;i<=k;i++) {
			ans+=ways2(n-i,k);
		}
		return ans;
	}
	public static int ways4(int n) {
		int dp[]=new int[n+1];
		Arrays.fill(dp, -1);
		dp[0]=0;
		dp[1]=1;
		if(n==0)
			return 1;
		if(n<0)
			return 0;
		if(dp[n]!=-1) {
			return dp[n];
		}else
			return dp[n]=ways4(n-1)+ways(n-2);
	}
	//bottom up approach
	public static int ways3(int n,int k) {
		int dp[]=new int[n+1];
		dp[0]=1;
		dp[1]=1;
		for(int i=2;i<=n;i++) {
			dp[i]=0;
			for(int j=1;j<=k;j++) {
				if(i-j>=0) {
				dp[i]=dp[i]+dp[i-j];
				}
			}
		}
		return dp[n];
		
	}
	public static void main(String args[]) {
		System.out.println(ways4(7));	}
}
