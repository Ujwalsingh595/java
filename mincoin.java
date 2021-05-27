package dp;
import java.lang.*;
import java.util.Arrays;
public class mincoin {
	//recursive approach
	public static int mincoins(int coins[],int n,int amount) {
		if(amount==0)
			return 0;
		int ans=Integer.MAX_VALUE;
		for(int i=0;i<n;i++) {
			if(amount-coins[i]>=0) {
			int subans=mincoins(coins,n,amount-coins[i]);
			if(subans!=Integer.MAX_VALUE) {
				ans=Math.min(ans,subans+1);
				}
			}
		}
		return ans;
	}
public  static int mincoins1(int coins[],int n,int amount)
{
	int smallAns=0;
	int dp[]=new int[amount+1];
	dp[0]=0;
	Arrays.fill(dp,Integer.MAX_VALUE);
	for(int i=1;i<=amount;i++) {
		for(int j=0;j<n;j++) {
			if(coins[j]<=i) {
				smallAns=dp[i-coins[j]];
				if(smallAns!=Integer.MAX_VALUE) {
					dp[i]=Math.min(dp[i], smallAns+1);
				}
			}
		}
	}
	return dp[amount];
}
	public static void main(String args[]) {
		int coins[]= {1,2,5};
		int n=3;
		int amount=15;
		
		System.out.println(mincoins(coins,n,amount));
		
	}
}
